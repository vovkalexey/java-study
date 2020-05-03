package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex2.product;

public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }

}
