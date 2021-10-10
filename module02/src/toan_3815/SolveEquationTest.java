package toan_3815;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import phanThanh.SolveEquation;

public class SolveEquationTest {
    @Test
    void test_1(){
        SolveEquation s = new SolveEquation();
        s.number1 =0;
        s.number2 =0;
        assertEquals("Multi roots",s.linearEquation());
    }
    @Test
    void test_2(){
        SolveEquation s = new SolveEquation();
        s.number1=0;
        s.number2=1;
        assertEquals("No roots", s.linearEquation());
    }

    @Test
    void test_3(){
        SolveEquation s = new SolveEquation();
        s.number1 =1;
        s.number2 =2;
        assertEquals("One roots", s.linearEquation());
    }
}
