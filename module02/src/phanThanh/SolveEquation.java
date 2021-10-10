package phanThanh;


public class SolveEquation {
    public int number1;
    public int number2;

    public String linearEquation() {
        if (number1 == 0)
            if (number2 == 0)
                return "Multi roots";
            else
                return "No roots";
        else
            return "One roots";
    }
}

