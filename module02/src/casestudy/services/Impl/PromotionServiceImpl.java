package casestudy.services.Impl;

import casestudy.models.Booking;
import casestudy.models.Customer;
import casestudy.services.BookingService;
import casestudy.services.PromotionService;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImpl implements PromotionService {
    static Set<Booking> bookingSet = BookingServiceImpl.sendBooking();
    static Scanner scanner = new Scanner(System.in);

    static {
        bookingSet.add(new Booking(1, "12/12/2021", "13/12/2021", BookingServiceImpl.chooseCustomer(1), BookingServiceImpl.chooseFacility("da trung cut")));
        bookingSet.add(new Booking(2, "14/12/2021", "17/12/2021", BookingServiceImpl.chooseCustomer(2), BookingServiceImpl.chooseFacility("dat nuoc")));
        //int idBooking, String arrivalDate, String lastDay, int idCustomer, String nameService, String typeService, Customer customer, Facility facility) {
    }

    static int voucher10 = 0;
    static int voucher20 = 0;
    static int voucher50 = 0;

    @Override
    public void displayListCustomersUseService() {
        System.out.println("Nhap nam: ");
        String year = scanner.nextLine();
        boolean check = true;
        for (Booking booking : bookingSet) {
            String[] strings = booking.getArrivalDate().split("/");
            String[] strings1 = booking.getLastDay().split("/");
            if (strings[2].equals(year) || strings1[2].equals(year)) {
                System.out.println(booking.getCustomer());
                check = false;
            }
        }
        if (check) {
            System.out.println("Khong co khach hang trong nam nay");
        }
    }

    @Override
    public void displayListCustomersGetVoucher() {
        System.out.println("Nhap ma giam gia 10%: ");
        try {
            voucher10 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai ma giam gia, nhap lại: ");
        }
        System.out.println("Nhap ma giam gia 20%: ");
        try {
            voucher20 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai ma giam gia, nhap lại: ");
        }
        System.out.println("Nhap ma giam gia 50%: ");
        try {
            voucher50 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai ma giam gia, nhap lại: ");
        }
        Stack<Booking> bookingStack = new Stack<>();
        bookingStack.addAll(bookingSet);
        while (!bookingStack.isEmpty() && voucher10 > 0) {
            Booking booking = bookingStack.pop();
            Customer customer = booking.getCustomer();
            System.out.println("Khach hang vua nhap ma giam gia 10%: " + customer);
            voucher10--;
        }
        while (!bookingStack.isEmpty() && voucher20> 0) {
            Booking booking = bookingStack.pop();
            Customer customer = booking.getCustomer();
            System.out.println("Khach hang vua nhap ma giam gia 20%: " + customer);
            voucher20--;
        }
        while (!bookingStack.isEmpty() && voucher50 > 0) {
            Booking booking = bookingStack.pop();
            Customer customer = booking.getCustomer();
            System.out.println("Khach hang vua nhap ma giam gia 50%: " + customer);
            voucher50--;
        }

    }
}
