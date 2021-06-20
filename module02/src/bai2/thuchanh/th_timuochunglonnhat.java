package bai2.thuchanh;

import java.util.Scanner;

public class th_timuochunglonnhat {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        a= Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.print("No greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a = a-b;
            }else {
                b= b- a;
            }
        }
        System.out.print("Greatest common factor: "+a);
    }
}
