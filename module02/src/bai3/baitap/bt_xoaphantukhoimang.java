package bai3.baitap;

import java.util.Scanner;

public class bt_xoaphantukhoimang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArray(a, sc);
        showArray(a);
        deleteArray(a,sc,n);
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
    public static void deleteArray(int b[], Scanner sc, int m) {
        System.out.print("Nhap phan so phan tu can xoa : ");
        int k = sc.nextInt();
        int index;
        for (int i = index = 0; i < m; i++) {
            if (b[i] != k) {
                b[index] = b[i];
                index++;
            }
        }
        m = index;
        System.out.println("Phan tu con lai trong mang khi xoa " + k + " la : ");
        for (int i = 0; i < m; i++) {
            System.out.println("Phan tu thu [" + i + "] la : " + b[i] + "\t");
        }
    }
}
