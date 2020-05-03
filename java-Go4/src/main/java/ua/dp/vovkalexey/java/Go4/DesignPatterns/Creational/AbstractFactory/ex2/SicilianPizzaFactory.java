package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory.BaseToppingFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory.SicillianToppingFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.CheesePizza;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.PepperoniPizza;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.Pizza;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.VeggiePizza;

public class SicilianPizzaFactory extends BasePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory= new SicillianToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
