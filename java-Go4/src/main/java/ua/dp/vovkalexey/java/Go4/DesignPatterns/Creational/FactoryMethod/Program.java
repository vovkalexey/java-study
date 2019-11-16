package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        Developer jDeveloper = new JavaDeveloper();
        jDeveloper.writeCode();

        Developer cDeveloper = new CppDeveloper();
        cDeveloper.writeCode();
    }
}
