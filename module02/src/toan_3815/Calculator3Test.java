package toan_3815;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import phanThanh.Calculator3;

public class Calculator3Test {
    @Test
    void test_add_1() {
        Calculator3 c = new Calculator3(2, 3);
        assertEquals(6, c.mul());
    }

    @Test
    void test_add_2() {
        Calculator3 c = new Calculator3(2000000,2);
        assertEquals(4000000, c.mul());

    }
}
