package pizzacution.query.interpreter;

import java.util.ArrayList;
import java.util.List;

import pizzacution.schema.Pizza;

public class PizzaContainer {
	private Pizza pizza;
	
	public PizzaContainer(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
		String output = "";
		boolean isFirst = true;
		
		output += this.pizza.getName();
		
		return output;
	}
}
