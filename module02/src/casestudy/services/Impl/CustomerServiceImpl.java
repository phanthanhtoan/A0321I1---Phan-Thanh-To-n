package casestudy.services.Impl;

import casestudy.data.ReadAndWrite;
import casestudy.models.Customer;
import casestudy.models.Employee;
import casestudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customersList= new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void disPlay() {
        for (Customer customer: customersList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        System.out.println("Nhap ten: ");
        String name = scanner.next();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Nhap dia chi: ");
        String address = scanner.next();
        System.out.println("Gioi tinh: ");
        String gender = scanner.next();
        System.out.println("Nhap SDT: ");
        int phoneNumber = scanner.nextInt();
        System.out.println("Nhap Email: ");
        String email = scanner.next();
        System.out.println("Nhap loai khach hang: ");
        String typeCustomer = scanner.next();
        Customer customer = new Customer(id, name, age, address, gender, phoneNumber, email, typeCustomer);
        customersList.add(customer);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
