package casestudy.services.Impl;

import casestudy.data.ReadAndWrite;
import casestudy.models.Booking;
import casestudy.models.Customer;
import casestudy.models.Facility;
import casestudy.models.Villa;
import casestudy.services.BookingService;
import casestudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "toan", 21, "danang", "nam", 399885400, "toan123@gmail.com", "vip"));
        customerList.add(new Customer(2, "toan", 21, "danang", "nam", 399885400, "toan123@gmail.com", "vip"));
        facilityIntegerMap.put(new Villa(1, "dat do an", 300, 1000000, "Vnd", "phong loai 1", "co day tu tien nghi", 100, 3), 0);
        facilityIntegerMap.put(new Villa(2, "dat nuoc", 300, 1000000, "Vnd", "phong loai 1", "co day tu tien nghi", 100, 3), 0);
        //  public Villa(int id, String service, double usedArea, double rentPrice, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor) {
    }

    //int id, String name, int age, String address, String gender, int phoneNumber, String email, String typeCustomer) {
    //        super(id, name, age, address, gender, phoneNumber, email

    public static Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void disPlayListBooking() {
        ReadAndWrite.readFile("src\\casestudy\\data\\booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhap id: ");
        int id1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngay bat dau thue: ");
        String arrivalDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong: ");
        String lastDay = scanner.nextLine();
        Booking booking = new Booking(id1, arrivalDate, lastDay, customer, facility);
        //int idBooking, String arrivalDate, String lastDay, int idCustomer, String nameService, String typeService
        bookingSet.add(booking);
        System.out.println("Da booking thanh cong!");
        ReadAndWrite.writeFile(bookingSet, "src\\casestudy\\data\\booking.csv");
    }

    @Override
    public void editBooking() {

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sach khach hang: ");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("Nhap id: ");
        boolean check = true;
        int customerCode = 0;
        try {
            customerCode = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai id, nhap lai !");
        }
        while (check) {
            for (Customer customer : customerList) {
                if (customerCode == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Nhap id khach hang: ");
                try {
                    customerCode = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Sai id, nhap lai ");
                }
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("Nhap lai id dich vu");
        boolean check = true;

        String serviceName = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (serviceName.equals(entry.getKey().getService())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Ban da nhap sai, nhap lai id dich vu");
                serviceName = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility(String service) {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (service.equals(entry.getKey().getService())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Customer chooseCustomer(int customerCode) {
        for (Customer customer : customerList) {
            if (customerCode == customer.getId()) {
                return customer;
            }
        }
        return null;
    }
}

