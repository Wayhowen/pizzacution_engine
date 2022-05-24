package pizzacution.query.interpreter;

import java.util.List;

import pizzacution.query.AtClause;
import pizzacution.query.IsServedClause;
import pizzacution.query.IsServedDirective;
import pizzacution.query.PizzaPlaceReference;
import pizzacution.query.SelectQuery;
import pizzacution.query.ThatClause;
import pizzacution.query.ThatDirective;
import pizzacution.schema.Pizza;

public class QueryInterpreter {
	public void interpret(SelectQuery query) throws Exception {
		//TODO: Do the actual interpretation
		System.out.println("DEBUG: In interpreter");
		
		
		List<ThatClause> tcs = query.getThatClause();
		for (ThatClause tc : tcs) {
			ThatDirective td = tc.getThatDirective();
			if (td.getIsServedClause() != null) {
				IsServedClause isc = td.getIsServedClause();
				List<IsServedDirective> isds = isc.getIsServedDirective();
				for (IsServedDirective isd: isds) {
					if (isd instanceof AtClause) {
						List<PizzaPlaceReference> pzplcRefs = ((AtClause) isd).getPizzaPlaceReference();
						for (PizzaPlaceReference ppr : pzplcRefs) {
							System.out.println(ppr.getPizzaPlace().getName());
						}
					}
				}
			}
		}
		
		
		System.out.println("Works");
	}
}
