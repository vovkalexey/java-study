package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Cheese;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Sauce;

public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
