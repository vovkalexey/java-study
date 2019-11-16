package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory jFactory = createDeveloperBySpec("java");
        Developer developer1 = jFactory.createDeveloper();
        developer1.writeCode();

        DeveloperFactory cFactory = createDeveloperBySpec("c++");
        Developer developer2 = cFactory.createDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory createDeveloperBySpec(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }

    }
}
