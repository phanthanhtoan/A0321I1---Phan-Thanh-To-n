package bai3.baitap;

import java.util.Scanner;

public class bt_themphantuvaomang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArray(a, sc);
        showArray(a);
    }
    public static void inputArray(int b[], Scanner sc) {
        for (int i = 0; i < b.length; i++) {
            System.out.print("Phan tu thu [" + i + "] la : ");
            b[i] = sc.nextInt();
        }
    }
    public static void showArray(int b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("Phan tu thu [" + i + "] : " + b[i]);
        }
    }
}
