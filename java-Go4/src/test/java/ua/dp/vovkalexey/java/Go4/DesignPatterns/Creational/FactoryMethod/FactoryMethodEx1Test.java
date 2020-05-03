package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex1.*;

public class FactoryMethodEx1Test {

    @Test
    public void testJavaDeveloper() {
        DeveloperFactory factory = new DeveloperFactoryImpl();
        Developer result = factory.createDeveloper("java");

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof JavaDeveloper);
    }

    @Test
    public void testCppDeveloper() {
        DeveloperFactory factory = new DeveloperFactoryImpl();
        Developer result = factory.createDeveloper("c++");

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof CppDeveloper);
    }

    @Test
    public void testPhpDeveloper() {
        DeveloperFactory factory = new DeveloperFactoryImpl();
        Developer result = factory.createDeveloper("php");

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof PhpDeveloper);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testUnknownDeveloper() {
        DeveloperFactory factory = new DeveloperFactoryImpl();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("some is unknown specialty");
        factory.createDeveloper("some");
    }

}