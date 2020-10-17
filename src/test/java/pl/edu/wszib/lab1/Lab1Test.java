package pl.edu.wszib.lab1;

import org.junit.jupiter.api.*;

public class Lab1Test {

    @BeforeAll
    public static void setup() {
        System.out.println("setup");
    }

    @BeforeEach
    public void setupEach() {
        System.out.println("setupEach");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("cleanup");
    }

    @AfterEach
    public void cleanupEach() {
        System.out.println("cleanupEach");
    }

    @Test
    void test() {
        System.out.println("First test");
    }
}
