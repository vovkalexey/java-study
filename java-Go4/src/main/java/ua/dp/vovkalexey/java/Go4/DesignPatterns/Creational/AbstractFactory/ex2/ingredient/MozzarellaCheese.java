package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.ingredient;

public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        prepareCheese();
    }

    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
