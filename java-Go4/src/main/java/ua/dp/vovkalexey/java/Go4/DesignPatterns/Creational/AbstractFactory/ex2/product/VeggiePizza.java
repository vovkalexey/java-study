package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory.BaseToppingFactory;

public class VeggiePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
