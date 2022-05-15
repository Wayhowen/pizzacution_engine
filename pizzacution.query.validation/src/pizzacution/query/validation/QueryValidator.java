package pizzacution.query.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import pizzacution.query.QueryPackage;
import pizzacution.query.SelectQuery;

public class QueryValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		System.out.println("called");
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
		System.out.println("working");
		if (QueryPackage.eINSTANCE.getSelectQuery().equals(eClass)) {
			System.out.println("Validating!");
			SelectQuery query = (SelectQuery) eObject;
			
			modelIsValid &= validateQuery(query);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateQuery(SelectQuery query) {
		boolean modelIsValid = true;
		
		modelIsValid &= testValidation(query);
		
		return modelIsValid;
	}
	
	protected boolean testValidation(SelectQuery query) {

		return constraintViolated(query, "Query wrong");
	}

	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
