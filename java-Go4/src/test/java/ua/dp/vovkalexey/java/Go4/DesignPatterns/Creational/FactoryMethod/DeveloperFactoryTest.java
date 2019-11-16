package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DeveloperFactoryTest {

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