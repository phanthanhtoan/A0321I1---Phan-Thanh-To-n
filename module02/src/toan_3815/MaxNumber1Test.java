package toan_3815;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import phanThanh.MaxNumer1;

public class MaxNumber1Test {
    @Test
    void test_1(){
        MaxNumer1 max = new MaxNumer1(3, 2, 1);
        assertEquals(3, max.max3());
    }

    @Test
    void test_2(){
        MaxNumer1 max = new MaxNumer1(1,3,2);
        assertEquals(3,max.max3());
    }
}
