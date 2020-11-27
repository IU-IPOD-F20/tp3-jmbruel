package pizza.factory;

import pizza.Pizza;

public abstract class PizzaFactory {
	
	public abstract Pizza create(String name);
}
