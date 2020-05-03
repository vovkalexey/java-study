package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2;

import org.junit.Test;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.Pizza;

import static org.junit.Assert.*;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}