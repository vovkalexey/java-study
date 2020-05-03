package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.CppDeveloper;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.Developer;

public class CppDeveloperFactory implements DeveloperFactory {

    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
