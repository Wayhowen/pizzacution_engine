package pizzacution.query.interpreter;

import java.util.ArrayList;
import java.util.List;

import pizzacution.query.AtClause;
import pizzacution.query.ContainsClause;
import pizzacution.query.CostClause;
import pizzacution.query.CostDirective;
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
import pizzacution.schema.SizeReference;

// TODO: this could clearly be optimized to be faster
public class QueryInterpreter {
	public List<PizzaContainer> interpret(SelectQuery query) throws Exception {
		// TODO: ensure via static sem that we have at least 1 AT clause
		List<ThatClause> thatClauses = query.getThatClause();
		
		// we get all the pizzas available at the places mentioned, then we will reduce this set
		List<Pizza> pizzas = this.getPizzasAvailable(thatClauses);
		
		// we do this here to do all the precalculations for pizzas
		List<PizzaContainer> pizzasConts = containerizePizzas(pizzas);
		System.out.println("-------------------");
		for (PizzaContainer pc : pizzasConts) {
			System.out.println(pc.price);
			System.out.println(pc.size.getPriceMultiplier());
		}
		System.out.println("-------------------");
		
		for (ThatClause thatClause : thatClauses) {
			ThatDirective thatDirective = thatClause.getThatDirective();
			if (thatDirective.getCostClause() != null) {
				// this will work with 1 cost clause with 1 cost directive only, else we would need complicated mechanisms
				pizzasConts = this.handleCostClause(thatDirective.getCostClause(), pizzasConts);
			} else if (thatDirective.getContainsClause().size() > 0){
				// TODO: handle
			} else if (thatDirective.getIsServedClause() != null) {
				// TODO: handle
			}
		}
	
		pizzas = this.handleWhatClause(query.getWhatClause(), pizzas);
		return pizzasConts;
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
	
	private List<PizzaContainer> handleCostClause(CostClause costClause, List<PizzaContainer> pizzasConts) {
		List<CostDirective> costDirectives = costClause.getCostDirective();
		
		// I am not very familiar with java's boilerplate and internals,
		// I suspect it could be done in a better manner with streams
		// but this also works
		List<PizzaContainer> filteredPizzas = new ArrayList();
		Comparator comparator = new Comparator();
		for (PizzaContainer pizzaCont : pizzasConts) {
			if (costDirectives.size() == 2) {
				CostDirective c1 = costDirectives.get(0);
				CostDirective c2 = costDirectives.get(1);
				if (comparator.operate(c1.getOperator(), pizzaCont.price, c1.getPrice()) ||
						comparator.operate(c2.getOperator(), pizzaCont.price, c2.getPrice())) {
					System.out.println(pizzaCont.price);
					filteredPizzas.add(pizzaCont);
				}
			} else {
				CostDirective c = costDirectives.get(0);
				if (comparator.operate(c.getOperator(), pizzaCont.price, c.getPrice())) {
					filteredPizzas.add(pizzaCont);
				}
			}
		}
		return filteredPizzas;
	}
	
	private List<Pizza> handleContainsClause(ContainsClause containsClause, List<Pizza> pizzas) {
		return new ArrayList();
	}
	
	private List<Pizza> handleIsServedClause(IsServedClause isServedClause, List<Pizza> pizzas) {
		return new ArrayList();
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
			for (SizeReference sizeRef : pizza.getSizeReference()) {
				containerizedPizzas.add(new PizzaContainer(pizza, sizeRef.getSize()));
			}
		}
		return containerizedPizzas;
	}
}
