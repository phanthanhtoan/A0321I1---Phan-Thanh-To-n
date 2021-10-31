package test;


import main.Greeter;
import main.impl.HelloWorld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        Greeter greeter = new HelloWorld();
        String actual = greeter.greet();
        String expected = "Hello";
        String assertResult = expected.equals(actual) ? "PASS" : "FAIL";
        String message = String.format("testGreet: %s, expected: <%s>, actual: <%s>", assertResult, expected, actual);
        System.out.println(message);
        assertEquals(expected, actual);
    }
}
