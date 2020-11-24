package pizzeria.factory;

import pizzeria.Pizzeria;
import pizzeria.impl.PizzeriaBrest;
import pizzeria.impl.PizzeriaStrasbourg;

public class PizzeriaFactory {
	
	static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	public Pizzeria create(String name) {
		switch (name) {
		case "Brest":
			return new PizzeriaBrest();
		case "Strasbourg":
			return new PizzeriaStrasbourg();
		default:
			return null;
		}
	}
}
