package bai2.baitap;

import java.util.Scanner;

public class bt_hienthimenucacloaihinh {
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int choice=1;
        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter lenght: ");
                    int dai = scanner.nextInt();
                    System.out.print("Enter width: ");
                    int rong = scanner.nextInt();
                    for (int i = 0; i < rong; i++) {
                        System.out.println("");
                        for (int j = 0; j < dai; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 2:
                    System.out.print("Enter height: ");
                    int h = scanner.nextInt();
                    System.out.print("Botton-left");
                    for (int i =1; i <= h; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    System.out.print("Botton-rigth");
                    for (int i=1; i <= h; i++) {
                        System.out.println(" ");
                        for (int j = h-i; j > 0; j--) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    System.out.print("Top-left");
                    for (int i = h; i > 0; i--) {
                        System.out.println("");
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    System.out.print("Top-right");
                    for (int i = h; i > 0; i--) {
                        System.out.println(" ");
                        for (int k = 0; k < h - i; k++) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 3:
                    System.out.print("Enter hight: ");
                    int hr = scanner.nextInt();
                    for(int i=1; i<=hr; i++){
                        for (int j=i; j<=hr-1; j++){
                            System.out.print("   ");
                        }
                        for (int j=1; j<=2*i-1; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    menu();
                    break;
                case 0:
                    System.out.print("Exit 🥱");
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    menu();
            }
        }
    }
}

