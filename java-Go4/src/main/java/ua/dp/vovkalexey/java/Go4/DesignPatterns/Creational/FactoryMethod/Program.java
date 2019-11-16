package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory jFactory = new JavaDeveloperFactory();
        Developer developer1 = jFactory.createDeveloper();
        developer1.writeCode();

        DeveloperFactory cFactory = new CppDeveloperFactory();
        Developer developer2 = cFactory.createDeveloper();
        developer2.writeCode();
    }
}
