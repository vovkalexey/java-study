package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex1;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.*;

public class DeveloperFactoryImpl implements DeveloperFactory {

    public Developer createDeveloper(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloper();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloper();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloper();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
