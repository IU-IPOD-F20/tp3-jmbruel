package pizzeria;

import org.junit.Test;

import pizza.Pizza;
import pizzeria.factory.PizzeriaFactory;

import static org.junit.Assert.*;

public class PizzeriaTest {

	@Test
	public void checkPizzasFromDifferentPizzeriasAreDifferent() {
		Pizzeria strasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
		Pizzeria brest = PizzeriaFactory.getInstance().create("Brest");

		Pizza pizza1 = strasbourg.orderPizza("cheese");
		Pizza pizza2 = brest.orderPizza("cheese");

		assertNotEquals(pizza1, pizza2);
	}

	@Test
	public void orderPizza() {
		Pizzeria strasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
		Pizza pizza1 = strasbourg.orderPizza("cheese");

		assertNotEquals(pizza1, null);
	}

}