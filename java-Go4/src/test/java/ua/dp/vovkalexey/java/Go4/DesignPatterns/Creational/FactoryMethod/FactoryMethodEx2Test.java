package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod;


import org.junit.Assert;
import org.junit.Test;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2.CppDeveloperFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2.DeveloperFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2.JavaDeveloperFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.FactoryMethod.ex2.PhpDeveloperFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class FactoryMethodEx2Test {

    @Test
    public void testJavaDeveloperByConcreteFactory() {
        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof JavaDeveloper);
    }

    @Test
    public void testCppDeveloperByConcreteFactory() {
        DeveloperFactory factory = new CppDeveloperFactory();
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof CppDeveloper);
    }

    @Test
    public void testPhpDeveloperByConcreteFactory() {
        DeveloperFactory factory = new PhpDeveloperFactory();
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof PhpDeveloper);
    }

    @Test
    public void testJavaDeveloper() {
        DeveloperFactory factory = createDeveloperBySpecialty("java");
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof JavaDeveloper);
    }

    @Test
    public void testCppDeveloper() {
        DeveloperFactory factory = createDeveloperBySpecialty("c++");
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof CppDeveloper);
    }

    @Test
    public void testPhpDeveloper() {
        DeveloperFactory factory = createDeveloperBySpecialty("php");
        Developer result = factory.createDeveloper();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof PhpDeveloper);
    }

    @Test(expected = RuntimeException.class)
    public void testUnknownDeveloper1() {
        createDeveloperBySpecialty("kotlin");
    }

    @Test
    public void testUnknownDeveloper2() {
        try {
            createDeveloperBySpecialty("python");
            fail("Expected an RuntimeException to be thrown");
        } catch (RuntimeException re) {
            assertThat(re.getMessage(), is("python is unknown specialty"));
        }
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }

}