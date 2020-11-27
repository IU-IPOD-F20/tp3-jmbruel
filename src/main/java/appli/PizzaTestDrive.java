package appli;

import pizza.Pizza;
import pizzeria.Pizzeria;
import pizzeria.factory.PizzeriaFactory;

/**
 * @author jmb
 *
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		Pizzeria shopFromBrest = PizzeriaFactory.getInstance().create("Brest");
		Pizzeria shopFromStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");

		Pizza pizza = shopFromBrest.orderPizza("cheese");
		System.out.println("JMB has ordered a " + pizza.getName());

		pizza = shopFromStrasbourg.orderPizza("cheese");
		System.out.println("JMI has ordered a " + pizza.getName());
	}
}