package org.example.sandbox.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class HelloWorldTest{

    @Test
    public void testHelloWorld() {
        assertEquals("Hello, World!", new HelloWorld().printString());
    }
}
