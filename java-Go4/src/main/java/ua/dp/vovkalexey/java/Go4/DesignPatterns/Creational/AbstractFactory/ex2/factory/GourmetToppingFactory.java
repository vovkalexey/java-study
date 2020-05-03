package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.factory;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.CaliforniaOilSauce;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Cheese;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.GoatCheese;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    public Cheese createCheese() {
        return new GoatCheese();
    }

    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
