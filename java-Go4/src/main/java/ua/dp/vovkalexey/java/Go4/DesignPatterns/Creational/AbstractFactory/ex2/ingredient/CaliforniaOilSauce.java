package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient.Sauce;

public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce() {
        prepareSauce();
    }

    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }
}
