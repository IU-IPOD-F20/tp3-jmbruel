// Initial author: Romain AURY IUT Blagnac / CPOA / 2020

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pizza.Pizza;
import pizzeria.Pizzeria;
import pizzeria.factory.PizzeriaFactory;

import static org.junit.Assert.*;

public class StepDefinitions {

    String strA;

    Pizza pizzaA;
    Pizza pizzaB;

    Pizzeria pizzeriaA;
    Pizzeria pizzeriaB;

    @Given("^a pizzeria(.+) A$")
    public void a_pizzeria_a(String style) {
        pizzeriaA = PizzeriaFactory.getInstance().create(style);
    }

    @Given("^a pizzeria(.+) B$")
    public void a_pizzeria_brest_b(String style) {
        pizzeriaB = PizzeriaFactory.getInstance().create(style);
    }

    @When("^A creates a (.+) pizza$")
    public void a_creates_a_pizza(String kind) {
        pizzaA = pizzeriaA.orderPizza(kind);
    }

    @When("^B creates a (.+) pizza$")
    public void b_creates_a_pizza(String kind) {
        pizzaB = pizzeriaB.orderPizza(kind);
    }

    @Then("A and B pizze have not the same name")
    public void a_s_and_b_s_pizze_have_not_the_same_name() {
        assertNotEquals(pizzaA.getClass().getSimpleName(), pizzaB.getClass().getSimpleName());
    }

    @Then("A and B pizze have the same name")
    public void a_s_and_b_s_pizze_have_the_same_name() {
        assertEquals(pizzaA.getClass().getSimpleName(), pizzaB.getClass().getSimpleName());
    }

    @Then("A and B pizze are not the same")
    public void a_s_and_b_s_pizze_are_not_the_same() {
        assertEquals(pizzaA, pizzaB);
    }

    @Given("a random String A")
    public void a_random_string_a() {
        strA = "random";
    }

    @Given("A is not Strasbourg or Brest")
    public void a_isn_t_strasbourg_or_brest() {
        assertNotEquals("Strasbourg", strA);
        assertNotEquals("Brest", strA);
    }

    @Then("the pizzeria is not created")
    public void the_pizzeria_isn_t_created() {
        assertEquals(null, pizzeriaA);
    }

    @Given("a string Brest A")
    public void a_string_brest_a() {
        strA = "Brest";
    }

    @Given("a string Strasbourg A")
    public void a_string_strasbourg_a() {
        strA = "Strasbourg";
    }

    @When("trying to create a pizzeria of type A")
    public void trying_to_create_a_pizzeria_of_type_a() {
        pizzeriaA = PizzeriaFactory.getInstance().create(strA);
    }

    @Then("the pizzeria is created")
    public void the_pizzeria_is_created() {
        assertNotEquals(null, pizzeriaA);
    }

}
