package toan_3815;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import phanThanh.Calculator1;


public class Calculator1Test {
    @Test
    void test_add_1() {
        Calculator1 c = new Calculator1();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void test_add_2() {
        Calculator1 c = new Calculator1();
        assertEquals(0, c.add(0, 0));
    }
    @Test
    void test_add_3(){
        Calculator1 c= new Calculator1();
        assertEquals(2, c.add(1, 1));
    }
}
