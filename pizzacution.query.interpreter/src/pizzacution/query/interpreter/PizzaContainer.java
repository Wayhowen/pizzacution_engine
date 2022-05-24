package pizzacution.query.interpreter;

import java.util.ArrayList;
import java.util.List;

import pizzacution.schema.DoughTypes;
import pizzacution.schema.Pizza;
import pizzacution.schema.Sauces;
import pizzacution.schema.Size;
import pizzacution.schema.ToppingReference;

public class PizzaContainer {
	private Pizza pizza;
	public Size size;
	public float price;
	public Sauces sauce;
	public DoughTypes dough;
	
	public PizzaContainer(Pizza pizza, Size size) {
		this.pizza = pizza;
		this.size = size;
		this.sauce = pizza.getSauce();
		this.dough = pizza.getDough();
		this.price = calculatePizzaPrice();
	}
	
	@Override
	public String toString() {
		String output = "";
		boolean isFirst = true;
		
		output += this.pizza.getName();
		output += " | ";
		output += String.format("%.02f", this.price);
		output += " DKK ";
		
		return output;
	}
	
	// this could be moved somewhere else probs, but here also works :)
	private float calculatePizzaPrice() {
		float basePrice = 1;
		for (ToppingReference topRef : this.pizza.getToppingReferences()) {
			basePrice += topRef.getTopping().getPrice();
		}
		System.out.println(basePrice + " " + this.size.getPriceMultiplier());
		return basePrice * this.size.getPriceMultiplier();
	}
}
