package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory {

    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
