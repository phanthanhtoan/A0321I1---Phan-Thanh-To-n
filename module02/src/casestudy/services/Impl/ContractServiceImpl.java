package casestudy.services.Impl;

import casestudy.data.ReadAndWrite;
import casestudy.models.Booking;
import casestudy.models.Contract;
import casestudy.models.Customer;
import casestudy.services.ContractService;

import java.sql.SQLOutput;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewContracts() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        bookingQueue.addAll(bookingSet);
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Tao hop dong cho: " + booking);
            System.out.println("Dang tao hop dong cho Booking co thong tin: " + booking.toString());
            System.out.println("Dang tao hop dong cho Booking co thong tin: " + customer.toString());
            System.out.println("Nhap ma hop dong: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("So tien tra truoc: ");
            int moneyPaid = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap tong chi phi: ");
            int totalMoney = Integer.parseInt(scanner.nextLine());

            Contract contract = new Contract(booking, id, moneyPaid, totalMoney);
//          Booking booking, int contractCode, double moneyPaid, double totalMoney
            contractList.add(contract);
            System.out.println("Da tao hop dong thanh cong: " + contract.toString());
            ReadAndWrite.writeFile(contractList, "src\\casestudy\\data\\contract.csv");
        }
    }

    @Override
    public void displayListContracts() {
        ReadAndWrite.readFile("src\\casestudy\\data\\contract.csv");
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContracts() {

    }
}
