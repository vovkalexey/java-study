package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactoryImpl();

        Developer developer1 = factory.createDeveloper("java");
        developer1.writeCode();

        Developer developer2 = factory.createDeveloper("c++");
        developer2.writeCode();
    }

}
