package pizza.factory.impl;

import pizza.Pizza;
import pizza.factory.PizzaFactory;
import pizza.impl.PizzaCheeseStyleStrasbourg;
import pizza.impl.PizzaGrecqueStyleStrasbourg;
import pizza.impl.PizzaPoivronStyleStrasbourg;

public class PizzaFactoryStrasbourg extends PizzaFactory {
	
	static PizzaFactoryStrasbourg uniqueInstance = new PizzaFactoryStrasbourg();

	protected PizzaFactoryStrasbourg() {}

	@Override
	public Pizza create(String name) {
		switch (name) {
		case "cheese":
			return new PizzaCheeseStyleStrasbourg();
		case "grecque":
			return new PizzaGrecqueStyleStrasbourg();
		case "poivrons":
			return new PizzaPoivronStyleStrasbourg();
		default:
			return null;
		}
	}
	
	public static PizzaFactoryStrasbourg getInstance() { 	
		return uniqueInstance;
	}	

}
