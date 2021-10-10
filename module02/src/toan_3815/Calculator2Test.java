package toan_3815;

import org.junit.jupiter.api.Test;
import phanThanh.Calculator2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator2Test {

    @Test
    void test_add_1() {
        Calculator2 c = new Calculator2();
        c.number1 = 0;
        c.number2 = 0;
        c.sub();
        assertEquals(0, c.result);
    }
    @Test
    void test_add_2() {
        Calculator2 c = new Calculator2();
        c.number1 = 0;
        c.number2 = 0;
        c.sub();
        assertEquals(-2, c.result);
    }
}
