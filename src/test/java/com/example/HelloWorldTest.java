package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testSayHello() {
        assertEquals("Hello, World!", HelloWorld.sayHello());
        System.out.println("[JAVA8]Assertion PASSED. Hence you found me here.");
    }
}
