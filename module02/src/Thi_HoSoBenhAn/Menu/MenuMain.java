package Thi_HoSoBenhAn.Menu;

import Thi_HoSoBenhAn.ChucNangBenhNhanThuongImpl;
import Thi_HoSoBenhAn.ChucNangBenhNhanVipImpl;
import casestudy.services.Impl.*;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---MENU---");
            System.out.println("1. Benh nhan thuong");
            System.out.println("2. Benh nhan VIP");
            System.out.println("3. Exit");
            System.out.print("Lua chon cua ban: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    MenuBenhNhanThuong();
                    break;
                case 2:
                    MenuBenhNhanVip();
                    break;
                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void MenuBenhNhanThuong() {
        ChucNangBenhNhanThuongImpl chucNangBenhNhanThuong = new ChucNangBenhNhanThuongImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Them benh danh thuong");
            System.out.println("2. Xoa benh an");
            System.out.println("3. Xem danh sach benh an");
            System.out.println("4. Thoat, ve menu chinh");
            System.out.print("Chon chuc nang MenuBenhNhanThuong: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    chucNangBenhNhanThuong.addNew();
                    break;
                case 2:
                   yesNoBenhNhanThuong();
                   break;
                case 3:
                    chucNangBenhNhanThuong.disPlay();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void yesNoBenhNhanThuong(){
        ChucNangBenhNhanThuongImpl chucNangBenhNhanThuong = new ChucNangBenhNhanThuongImpl();
        boolean  check =true;
        int choice = 0;
        while (check){
            System.out.println("1. Yes ");
            System.out.println("2. No, quay lai ds benh nhan thuong  ");
            Scanner scanner= new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice){
                case 1:
                    chucNangBenhNhanThuong.delete();
                    System.out.println("Xoa thanh cong");
                    break;
                case 2:
                    MenuBenhNhanThuong();
                    break;
            }
        }
    }

    public static void MenuBenhNhanVip() {
        ChucNangBenhNhanVipImpl  chucNangBenhNhanVip = new ChucNangBenhNhanVipImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Them benh danh thuong");
            System.out.println("2. Xoa benh an");
            System.out.println("3. Xem danh sach benh an");
            System.out.println("4. Thoat, ve menu chinh");
            System.out.print("Chon chuc nang MenuBenhNhanVip: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice) {
                case 1:
                    chucNangBenhNhanVip.addNew();
                    break;
                case 2:
                    yesNoBenhNhanVip();
                    break;
                case 3:
                    chucNangBenhNhanVip.disPlay();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void yesNoBenhNhanVip(){
        ChucNangBenhNhanVipImpl chucNangBenhNhanVip = new ChucNangBenhNhanVipImpl();
        boolean  check =true;
        int choice = 0;
        while (check){
            System.out.println("1. Yes ");
            System.out.println("2. No, quay lai ds benh nhan vip ");
            Scanner scanner= new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhapp lai: ");
            }
            switch (choice){
                case 1:
                    chucNangBenhNhanVip.delete();
                    System.out.println("Xoa thanh cong");
                    break;
                case 2:
                    MenuBenhNhanVip();
                    break;
            }
        }
    }
}
