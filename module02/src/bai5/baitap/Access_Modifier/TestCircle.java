package bai5.baitap.Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());

        Circle c1 = new Circle(6 , "Red");
        System.out.println(c1);
    }
}
