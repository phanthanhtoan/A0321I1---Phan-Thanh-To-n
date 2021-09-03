package test;


public class test {
    public static void main(String args[]) {
        int x = 3, y = 5, z = 10;
        int value = ++z + y - y + z + x++;
        System.out.println(value);
    }
}
