package pizzeria;

import pizza.Pizza;
import pizza.factory.PizzaFactory;

public abstract class Pizzeria {
	PizzaFactory pizzaFactory;

	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();
		return pizza;
	}

	public Pizzeria(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	protected Pizza createPizza(String type) {
		return pizzaFactory.create(type);
	}
}
