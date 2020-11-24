package pizza.impl;

import pizza.Pizza;

public class PizzaCheeseStyleStrasbourg extends Pizza {
	public PizzaCheeseStyleStrasbourg() {
		name = "Pizza Strasbourg style with cheese";
		crust = "Thick crust";
		sauce = "Tomato sauce";
		garnitures.add("Mozzarella");
	}

	@Override
	public void cut() {
		System.out.println("Cut in square portions");
	}
}
