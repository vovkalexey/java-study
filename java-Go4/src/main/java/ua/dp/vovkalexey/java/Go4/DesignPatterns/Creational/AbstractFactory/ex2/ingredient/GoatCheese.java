package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient;

public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    public void prepareCheese() {
        System.out.println("Preparing goat cheese...");
    }
}
