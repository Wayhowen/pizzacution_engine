package pizzacution.query.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;

import pizzacution.query.AtClause;
import pizzacution.query.InClause;
import pizzacution.query.IsServedClause;
import pizzacution.query.IsServedDirective;
import pizzacution.query.PizzaPlaceReference;
import pizzacution.query.QueryPackage;
import pizzacution.query.SelectQuery;
import pizzacution.query.ThatClause;
import pizzacution.query.ThatDirective;
import pizzacution.schema.PizzaPlace;
import pizzacution.schema.SizeReference;

public class QueryValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	private int costClausesAllowed = 1;
	private int containsClausesAllowed = 2;
	
	// 2 isServed bc can be served at place or in size
	private int isServedClausesAllowed = 2;
	
	// TODO: this generally could be extended, however we for now only work with 1 pizza place and only sizes from there
	private int inClausesAllowed = 1;
	
	private int atClausesAllowed = 1;
	private Set<PizzaPlace> pizzaPlaces = new HashSet<PizzaPlace>();
	private Set<SizeReference> sizeRefs = new HashSet<SizeReference>();
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(QueryPackage.eINSTANCE, new QueryValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		if (QueryPackage.eINSTANCE.getSelectQuery().equals(eClass)) {
			SelectQuery query = (SelectQuery) eObject;
			
			modelIsValid &= validateQuery(query);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateQuery(SelectQuery query) {
		boolean modelIsValid = true;
		
		modelIsValid &= verifyThatNoClauseIsRepeated(query.getThatClause());
		
		this.resetConstraints();
		return modelIsValid;
	}
	
	// ensure that we don't have multiple ThatDirectives with different children.
	protected boolean verifyThatNoClauseIsRepeated(List<ThatClause> thatClauses) {
		boolean modelIsValid = true;
		
		for (ThatClause thatClause : thatClauses) {
			ThatDirective thatDirective = thatClause.getThatDirective();
			if (thatDirective.getCostClause() != null ) {
				costClausesAllowed -= 1;
				if (costClausesAllowed < 0) {
					modelIsValid &= constraintViolated(thatDirective, "There cannot be more than 1 'costs' clause.");
				}
			} else if (!thatDirective.getContainsClause().isEmpty()) {
				containsClausesAllowed -= thatDirective.getContainsClause().size();
				if (containsClausesAllowed < 0) {
					modelIsValid &= constraintViolated(thatDirective, "There cannot be more than 2 'has' clauses.");
				}
			} else if (thatDirective.getIsServedClause() != null) {
				isServedClausesAllowed -= 1;
				if (isServedClausesAllowed < 0) {
					modelIsValid &= constraintViolated(thatDirective, "There cannot be more than 2 'is served' clauses.");
				}
				modelIsValid &= this.validateIsServedClause(thatDirective.getIsServedClause());
			}
		}
		return modelIsValid;
	}
	
	protected boolean validateIsServedClause(IsServedClause isServedClause) {
		boolean modelIsValid = true;
		
		for (IsServedDirective isServedDirective : isServedClause.getIsServedDirective()) {
			if (isServedDirective instanceof InClause) {
				this.inClausesAllowed -= 1;
				if (inClausesAllowed < 0) {
					modelIsValid &= constraintViolated(isServedDirective, "There can be only 1 'served in' clause.");
				}
				modelIsValid &= validateSameSizeIsNotMentionedTwice((InClause) isServedDirective);
			} else if (isServedDirective instanceof AtClause){
				this.atClausesAllowed -= 1;
				if (atClausesAllowed < 0) {
					modelIsValid &= constraintViolated(isServedDirective, "There can be only 1 'served at' clause.");
				}
				modelIsValid &= validateIsServedAtDoesntMentionSamePlaceTwice((AtClause) isServedDirective);
			}
		}
		
		return modelIsValid;
	}
	
	protected boolean validateIsServedAtDoesntMentionSamePlaceTwice(AtClause atClause) {
		boolean modelIsValid = true;
		
		for (PizzaPlaceReference pzplcRef : atClause.getPizzaPlaceReference()) {
			if (this.pizzaPlaces.contains(pzplcRef.getPizzaPlace())) {
				modelIsValid &= constraintViolated(pzplcRef, "Same pizza place cannot be mentioned twice.");
			} else {
				this.pizzaPlaces.add(pzplcRef.getPizzaPlace());
			}
		}
		
		return modelIsValid;
	}
	
	protected boolean validateSameSizeIsNotMentionedTwice(InClause inClause) {
		boolean modelIsValid = true;
		
		for (SizeReference sizeRef : inClause.getSizeReference()) {
			if (this.sizeRefs.contains(sizeRef)) {
				modelIsValid &= constraintViolated(sizeRef, "Same size cannot be mentioned twice.");
			} else {
				this.sizeRefs.add(sizeRef);
			}
		}
		
		return modelIsValid;
	}

	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
	
	void resetConstraints() { 
		this.costClausesAllowed = 1;
		this.containsClausesAllowed = 2;
		// 2 isServed bc can be served at place or in size
		this.isServedClausesAllowed = 2;
		this.inClausesAllowed = 1;
		this.atClausesAllowed = 1;
		this.pizzaPlaces.clear();
		this.sizeRefs.clear();
	}
}
