package pizza;

import java.util.ArrayList;

/**
 * = Asciidoclet
 *
 * Sample comments that include `source code` by mailto:jbruel@gmail.com[JMB].
 *
 * [source,java] --
 * include::src/java/pizzeria.Pizzeria/src/pizza.Pizza.java[lines=14..34] --
 *
 * @author bruel
 *
 */
public abstract class Pizza {
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparation of " + name);
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
		System.out.println("Add the garnitures:");
		for (String garniture : garnitures) {
			System.out.println(garniture);
		}
	}

	public void bake() {
		System.out.println("Bake 25 minutes at 180 degrees");
	}

	public void cut() {
		System.out.println("Cut the pizza in triangles");
	}

	public void wrap() {
		System.out.println("Put the pizza in the official box");

	}

	public String getName() {
		return name;
	}
}
