package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);

}
