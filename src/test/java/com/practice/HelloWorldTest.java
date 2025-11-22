package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for HelloWorld.
 */
class HelloWorldTest {
    
    @Test
    void testGreet() {
        String result = HelloWorld.greet("Java");
        assertEquals("Hello, Java!", result);
    }
    
    @Test
    void testGreetWithDifferentName() {
        String result = HelloWorld.greet("World");
        assertEquals("Hello, World!", result);
    }
    
    @Test
    void testGreetNotNull() {
        String result = HelloWorld.greet("Test");
        assertNotNull(result);
    }
}
