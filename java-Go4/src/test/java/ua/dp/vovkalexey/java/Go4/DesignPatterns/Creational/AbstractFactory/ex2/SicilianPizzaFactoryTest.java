package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2;

import org.junit.Test;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.Pizza;

import static org.junit.Assert.*;

public class SicilianPizzaFactoryTest {

    @Test
    public void createPizza() {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}