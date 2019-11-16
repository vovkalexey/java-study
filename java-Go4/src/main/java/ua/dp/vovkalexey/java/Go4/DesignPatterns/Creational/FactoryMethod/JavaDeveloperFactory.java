package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {

    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
