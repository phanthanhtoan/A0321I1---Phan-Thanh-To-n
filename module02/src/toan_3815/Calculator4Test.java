package toan_3815;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import phanThanh.Calculator4;

public class Calculator4Test {
    @Test
    void test_1() {
        Calculator4 c = new Calculator4();
        c.setNumber1(5);
        c.setNumber2(2);
        assertEquals(2.5,c.div() );
    }
}
