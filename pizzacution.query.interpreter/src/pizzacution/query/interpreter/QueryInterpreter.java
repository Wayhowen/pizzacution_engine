package pizzacution.query.interpreter;

import java.util.ArrayList;
import java.util.List;

import pizzacution.query.AtClause;
import pizzacution.query.InClause;
import pizzacution.query.IsServedClause;
import pizzacution.query.IsServedDirective;
import pizzacution.query.PizzaPlaceReference;
import pizzacution.query.SelectQuery;
import pizzacution.query.SomePizza;
import pizzacution.query.ThatClause;
import pizzacution.query.ThatDirective;
import pizzacution.query.WhatClause;
import pizzacution.schema.Pizza;
import pizzacution.schema.PizzaPlace;

public class QueryInterpreter {
	public List<PizzaContainer> interpret(SelectQuery query) throws Exception {
		// TODO: ensure via static sem that we have at least 1 AT clause
		List<ThatClause> thatClauses = query.getThatClause();
		
		// we get all the pizzas available at the places mentioned, then we will reduce this set
		List<Pizza> pizzas = this.getPizzasAvailable(thatClauses);
		
		for (ThatClause thatClause : thatClauses) {
			ThatDirective thatDirective = thatClause.getThatDirective();
			if (thatDirective.getCostClause() != null) {
				// TODO: handle
			} else if (thatDirective.getContainsClause().size() > 0){
				// TODO: handle
			} else if (thatDirective.getIsServedClause() != null) {
				// TODO: handle
			}
		}
	
		pizzas = this.handleWhatClause(query.getWhatClause(), pizzas);
		return containerizePizzas(pizzas);
	}
	
	private List<Pizza> getPizzasAvailable(List<ThatClause> thatClauses) {
		List<Pizza> pizzas = new ArrayList();
		for (ThatClause tc : thatClauses) {
			ThatDirective td = tc.getThatDirective();
			if (td.getIsServedClause() != null) {
				List<IsServedDirective> isServedDirectives = td.getIsServedClause().getIsServedDirective();
				for (IsServedDirective isc : isServedDirectives) {
					if (isc instanceof AtClause) {
						for (PizzaPlaceReference pzplcRef : ((AtClause) isc).getPizzaPlaceReference()) {
							PizzaPlace pzplc = pzplcRef.getPizzaPlace();
							for (Pizza pizza : pzplc.getPizzasAvailable()) {
								pizzas.add(pizza);
							}
						}
					}
				}
			}
		}
		return pizzas;
	}
	
	private List<Pizza> handleWhatClause(WhatClause whatClause, List<Pizza> pizzas) {
		if (whatClause instanceof SomePizza) {
			return pizzas.subList(0, 1);
		} 
		return pizzas;
	}
	
	private List<PizzaContainer> containerizePizzas(List<Pizza> pizzas) {
		List<PizzaContainer> containerizedPizzas = new ArrayList();
		for (Pizza pizza : pizzas) {
			containerizedPizzas.add(new PizzaContainer(pizza));
		}
		return containerizedPizzas;
	}
}
