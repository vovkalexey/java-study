package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        JavaDeveloper jDeveloper = new JavaDeveloper();
        jDeveloper.writeJavaCode();

        CppDeveloper cDeveloper = new CppDeveloper();
        cDeveloper.writeCppCode();
    }
}
