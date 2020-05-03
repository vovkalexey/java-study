package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.Developer;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {

    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
