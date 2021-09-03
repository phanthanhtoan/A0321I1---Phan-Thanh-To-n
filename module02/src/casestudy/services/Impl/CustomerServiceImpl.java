package casestudy.services.Impl;

import casestudy.data.ReadAndWrite;
import casestudy.models.Customer;
import casestudy.models.Employee;
import casestudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customersList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Customer isCustomer(int customerCode) {
        for (Customer customer : customersList) {
            if (customer.getId() == customerCode) {
                return customer;
            }
        }
        return null;
    }
    @Override
    public void disPlay() {
        customersList = (List<Customer>) ReadAndWrite.readFile("E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\casestudy\\data\\customer.csv");
        for (Customer customer : customersList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap SDT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap loai khach hang: ");
        String typeCustomer = scanner.nextLine();

        Customer customer = new Customer(id, name, age, address, gender, phoneNumber, email, typeCustomer);
        customersList.add(customer);

        ReadAndWrite.writeFile(customersList, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\casestudy\\data\\customer.csv");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        System.out.println("Nhap id khach hang can xoa: ");
        int idCustomer = 0;
        try {
            idCustomer = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai id nhan vien, nhap lai: ");
        }
        Customer customer = isCustomer(idCustomer);
        customersList.remove(customer);
        ReadAndWrite.writeFile(customersList, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\casestudy\\data\\customer.csv");
        System.out.println("Xoa thanh cong");
    }
}
