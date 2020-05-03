package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient;

public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    public void prepareSauce() {
        System.out.println("Preparing tomato sauce..");
    }
}
