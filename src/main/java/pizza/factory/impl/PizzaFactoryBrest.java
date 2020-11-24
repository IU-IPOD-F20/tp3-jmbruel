package pizza.factory.impl;

import pizza.Pizza;
import pizza.factory.PizzaFactory;
import pizza.impl.PizzaCheeseStyleBrest;
import pizza.impl.PizzaGrecqueStyleBrest;
import pizza.impl.PizzaPoivronStyleBrest;

public class PizzaFactoryBrest extends PizzaFactory {
	
	static PizzaFactoryBrest uniqueInstance = new PizzaFactoryBrest();

	protected PizzaFactoryBrest() {}
	
	@Override
	public Pizza create(String name) {
		switch (name) {
		case "cheese":
			return new PizzaCheeseStyleBrest();
		case "grecque":
			return new PizzaGrecqueStyleBrest();
		case "poivrons":
			return new PizzaPoivronStyleBrest();
		default:
			return null;
		}
	}

	public static PizzaFactoryBrest getInstance() { 	
		return uniqueInstance;
	}	
}
