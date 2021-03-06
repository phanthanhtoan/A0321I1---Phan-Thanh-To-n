package casestudy.controllers;

import casestudy.models.Booking;
import casestudy.services.CustomerService;
import casestudy.services.FacilityService;
import casestudy.services.Impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---MENU---");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    MenuEmployee();
                    break;
                case 2:
                    MenuCustomer();
                    break;
                case 3:
                    MenuFacility();
                    break;
                case 4:
                    MenuBooking();
                    break;
                case 5:
                    MenuPromotion();
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void MenuEmployee() {
        EmloyeeServiceImpl emloyeeService = new EmloyeeServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            System.out.print("Enter your choice MenuEmployee: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    emloyeeService.disPlay();
                    break;
                case 2:
                    emloyeeService.addNew();
                    break;
                case 3:
                    emloyeeService.edit();
                    break;
                case 4:
                    emloyeeService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void MenuCustomer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Return main menu");
            System.out.print("Enter your choice MenuCustomer: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    customerService.disPlay();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void MenuFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new  Facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.print("Enter your choice MenuFacility: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.addNewVilla();
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void addNewMenuFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Add new Villa");
            System.out.println("2. Add new  House ");
            System.out.println("3. Add new  Room ");
            System.out.println("4. Return main menu");
            System.out.print("Enter your choice MenuFacility: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    MenuFacility();
                    break;
            }
        }
    }

    public static void MenuBooking() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Enter your choice: MenuBooking ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    bookingService.addBooking();
                    break;
                case 2:
                    bookingService.disPlayListBooking();
                    break;
                case 3:
                    contractService.addNewContracts();
                    break;
                case 4:
                    contractService.displayListContracts();
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void MenuPromotion() {
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Enter your choice MenuPromotion: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    promotionService.displayListCustomersUseService();
                    break;
                case 2:
                    promotionService.displayListCustomersGetVoucher();
                    System.out.println("2");
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }
}

