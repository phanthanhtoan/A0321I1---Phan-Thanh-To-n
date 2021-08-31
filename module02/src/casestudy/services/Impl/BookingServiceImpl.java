package casestudy.services.Impl;

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
    static Scanner scanner= new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "toan", 21, "danang", "nam", 399885400, "toan123@gmail.com", "vip"));
        facilityIntegerMap.put(new Villa(1, "da trung cut", 300, 1000000, "Vnd", "phong loai 1", "co day tu tien nghi", 100, 3), 0);
        //  public Villa(int id, String service, double usedArea, double rentPrice, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor) {
    }

    //int id, String name, int age, String address, String gender, int phoneNumber, String email, String typeCustomer) {
    //        super(id, name, age, address, gender, phoneNumber, email
    @Override
    public void disPlayListBooking() {
        for (Booking booking: bookingSet){
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() +1;
        }
        Customer customer =chooseCustomer();
        Facility facility =chooseFacility();
        System.out.println("Ngay bat dau thue: ");
        String arrivalDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong: ");
        String lastDay = scanner.nextLine();
        Booking booking = new Booking(id, arrivalDate, lastDay, customer, facility);
        //int idBooking, String arrivalDate, String lastDay, int idCustomer, String nameService, String typeService
        bookingSet.add(booking);
        System.out.println("Da booking thanh cong!");
    }

    @Override
    public void editBooking() {

    }
    public static  Customer chooseCustomer(){
        System.out.println("Danh sach khach hang: ");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("Nhap id: ");
        boolean check = true;
        int customerCode = 0;
        try {
            customerCode = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
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
                }catch (NumberFormatException e) {
                    System.out.println("Sai id, nhap lai ");
                }
            }
        }
        return null;
    }
    public static  Facility chooseFacility(){
        System.out.println("Display facility: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("Enter again service Name");
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
                System.out.println("Enter again service Name");
                serviceName = scanner.nextLine();
            }
        }
        return null;
    }
}
