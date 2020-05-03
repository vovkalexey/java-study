package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Cheese;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.MozzarellaCheese;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Sauce;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory {

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
