package ua.dp.vovkalexey.junit5.getstarted;

import org.junit.jupiter.api.*;

@DisplayName("JUnit 5 Example")
class JUnit5ExampleTest {

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void setupBeforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void teardownAfterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void teardownAfterAll() {
        System.out.println("After all test methods");
    }

    @Nested
    @DisplayName("Tests for the method A")
    class A {

        @BeforeEach
        void beforeEach() {
            System.out.println("Before each test method of the A class");
        }

        @AfterEach
        void afterEach() {
            System.out.println("After each test method of the A class");
        }

        @Test
        @DisplayName("Example test for method A")
        void sampleTestForMethodA() {
            System.out.println("Example test for method A");
        }

        @Nested
        @DisplayName("When X is true")
        class WhenX {

            @BeforeEach
            void beforeEach() {
                System.out.println("Before each test method of the WhenX class");
            }

            @AfterEach
            void afterEach() {
                System.out.println("After each test method of the WhenX class");
            }

            @Test
            @DisplayName("Example test for method A when X is true")
            void sampleTestForMethodAWhenX() {
                System.out.println("Example test for method A when X is true");
            }
        }
    }
}
