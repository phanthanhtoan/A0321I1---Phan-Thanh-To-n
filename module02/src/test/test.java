package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = 1;
        while (true) {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                int choice1 = 1;
                while (choice1 != 4) {
                    System.out.println("1 Display list employees");
                    System.out.println("2 Add new employee");
                    System.out.println("3 Edit employee");
                    System.out.println("4 Return main menu");
                    System.out.println("Enter your choice employees: ");
                    choice1 = input.nextInt();
                    if (choice1 == 1) {
                        System.out.println("Display list employees");
                    } else if (choice1 == 2) {
                        System.out.println("Add new employee");
                    } else if (choice1 == 3) {
                        System.out.println("Edit employee");
                    } else if (choice1 == 4) {
                        break;
                    } else System.out.println("No choice!");
                }
            } else if (choice == 2) {
                int choice2 = 1;
                while (choice2 != 4) {
                    System.out.println("1 Display list customers");
                    System.out.println("2 Add new customer");
                    System.out.println("3 Edit customer");
                    System.out.println("4 Return main menu");
                    System.out.println("Enter your choice customers: ");
                    choice2 = input.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Display list customers");
                    } else if (choice2 == 2) {
                        System.out.println("Add new customer");
                    } else if (choice2 == 3) {
                        System.out.println("Edit customer");
                    } else System.out.println("No choice!");
                }
            } else if (choice == 3) {
                int choice3 = 1;
                while (choice3 != 4) {
                    System.out.println("1 Display list facility");
                    System.out.println("2 Add new facility");
                    System.out.println("3 Display list facility maintenance");
                    System.out.println("4 Return main menu");
                    System.out.println("Enter your choice facility: ");
                    choice3 = input.nextInt();
                    if (choice3 == 1) {
                        System.out.println("Display list facility");
                    } else if (choice3 == 2) {
                        System.out.println("Add new facility");
                    } else if (choice3 == 3) {
                        System.out.println("Display list facility maintenance");
                    } else System.out.println("No choice!");
                }
            } else if (choice == 4) {
                int choice4 = 1;
                while (choice4 != 6) {
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    System.out.println("Enter your choice booking: ");
                    choice4 = input.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Display list facility");
                    } else if (choice4 == 2) {
                        System.out.println("Add new facility");
                    } else if (choice4 == 3) {
                        System.out.println("Display list facility maintenance");
                    } else if (choice4 == 4) {
                        System.out.println("4. Display list contracts");
                    } else if (choice4 == 5) {
                        System.out.println("5. Edit contracts");
                    } else System.out.println("No choice!");
                }
            } else if (choice == 5) {
                int choice5 = 1;
                while (choice5 != 3) {
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    System.out.println("Enter your choice promotion: ");
                    choice5 = input.nextInt();
                    if (choice5 == 1) {
                        System.out.println("1. Display list customers use service");
                    } else if (choice5 == 2) {
                        System.out.println("2. Display list customers get voucher");
                    } else System.out.println("No choice!");
                }
            } else if (choice == 6) {
                System.exit(6);
            } else {
                System.out.println("No choice!");
            }
        }
    }
}
