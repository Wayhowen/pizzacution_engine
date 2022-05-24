package pizzacution.query.interpreter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import pizzacution.schema.DoughTypes;
import pizzacution.schema.Pizza;
import pizzacution.schema.Sauces;
import pizzacution.schema.Size;
import pizzacution.schema.Topping;
import pizzacution.schema.ToppingReference;

public class PizzaContainer {
	private Pizza pizza;
	public Size size;
	public float price;
	public Sauces sauce;
	public DoughTypes dough;
	// this is hash set since those cannot be repeated and it makes processing later on faster
	public HashSet<Topping> toppings;
	
	public PizzaContainer(Pizza pizza, Size size) {
		this.pizza = pizza;
		this.size = size;
		this.sauce = pizza.getSauce();
		this.dough = pizza.getDough();
		this.price = calculatePizzaPrice();
		this.toppings = this.getToppings();
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
		return basePrice * this.size.getPriceMultiplier();
	}
	
	private HashSet<Topping> getToppings() {
		HashSet<Topping> toppings = new HashSet();
		for (ToppingReference tr : this.pizza.getToppingReferences()) {
			toppings.add(tr.getTopping());
		}
		return toppings;
	}
}
