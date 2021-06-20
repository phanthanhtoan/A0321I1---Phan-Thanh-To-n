package bai2.thuchanh;

import java.util.Scanner;

public class th_thietkemenuungdung {
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
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
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    menu();
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    menu();
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
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
