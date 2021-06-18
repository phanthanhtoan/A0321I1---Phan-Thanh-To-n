package bai1_Introduction_to_Java.baitap;

import java.util.Scanner;

public class bt_chuyendoitiente {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Use ra VNĐ: ");
        usd = scanner.nextInt();
        int quydoi = usd*vnd;
        System.out.print("Giá trị USD sau khi đổi ra VNĐ: "+quydoi +" VNĐ");
    }
}
