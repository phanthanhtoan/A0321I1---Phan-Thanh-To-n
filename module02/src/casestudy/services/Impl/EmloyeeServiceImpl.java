package casestudy.services.Impl;

import casestudy.data.ReadAndWrite;
import casestudy.models.Employee;
import casestudy.models.Person;
import casestudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmloyeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

//    static {
//        employeeList = new ArrayList<>();
//        employeeList.add(new Employee("1", "Toan", "21", "DaNang", "Nam",
//                "0123123", "toan123@gmail.com", "GiamDoc", "300000");
//    }

    //

    public Employee isEmployee(int employeeCode) {
        for (Employee employees : employeeList) {
            if (employees.getId() == employeeCode) {
                return employees;
            }
        }
        return null;
    }

    @Override
    public void disPlay() {
        employeeList = (List<Employee>) ReadAndWrite.readFile("E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\casestudy\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("Nhap chuc vu: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(id, name, age, address, gender, phoneNumber, email, position, salary);
        employeeList.add(employee);

        ReadAndWrite.writeFile(employeeList, "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\casestudy\\data\\employee.csv");
    }

    @Override
    public void edit() {
//        String id;
//        do {
//            System.out.println("Nhap id nhan vien can sua:  ");
//            id = scanner.nextLine();
//            if (checkExist(id) == null) {
//                System.out.println("Id nhan vien khong ton tai ");
//            }
//        } while (checkExist(id) == null);
//        Employee employee = (Employee) checkExist(id);
//        int choice = -1;
//        do {
//            System.out.println("Nhap id nhan vien can sua: ");
//            System.out.println("1. Ten ");
//            System.out.println("2. Tuoi ");
//            System.out.println("3. Dia chi ");
//            System.out.println("4. SDT ");
//            System.out.println("5. Email ");
//            System.out.println("6. Chuc vu ");
//            System.out.println("7. Luong ");
//            System.out.println("8. Tro ve menu ");
//            System.out.println("Lua chon cua ban: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhap ten moi: ");
//                    String name = scanner.nextLine();
//                    employee.setName(name);
//                    break;
//                case 2:
//                    System.out.println("Nhap tuoi moi: ");
//                    int age = scanner.nextInt();
//                    employee.setAge(age);
//                    break;
//                case 3:
//                    System.out.println("Nhap dia chi moi: ");
//                    String address = scanner.nextLine();
//                    employee.setAddress(address);
//                    break;
//                case 4:
//                    System.out.println("Nhap SDT moi: ");
//                    int phoneNumber = scanner.nextInt();
//                    employee.setPhoneNumber(phoneNumber);
//                    break;
//                case 5:
//                    System.out.println("Nhap Email moi: ");
//                    String email = scanner.nextLine();
//                    employee.setEmail(email);
//                    break;
//                case 6:
//                    System.out.println("Nhap chuc vu moi: ");
//                    String position = scanner.nextLine();
//                    employee.setPosition(position);
//                    break;
//                case 7:
//                    System.out.println("Nhap luong moi: ");
//                    Double salary = scanner.nextDouble();
//                    break;
//                case 8:
//                    return;
//                default:
//                    System.out.println("Lua chon sai! Chon lai");
//            }
//
//        } while (true);
        System.out.println("Nhap ma vien can sua: ");
        int employeeCode = 0;
        try {
            employeeCode = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai ma, nhap lai: ");
        }
        Employee employee = isEmployee(employeeCode);
        if (employee != null) {
            System.out.println("Chon:  ");
            System.out.println("1. Sdt:  ");
            System.out.println("2. Email: ");
            System.out.println("3. Chuc vu: ");
            System.out.println("4. Luong: ");
            System.out.println("6. Danh danh nhan vien: ");
            System.out.println("7.Tro lai");
            int choice = 1; // String name, int age, String address, String gender, int phoneNumber, String email, String position, double salar
            int phoneNumber;
            String email;
//            String position;
            while (choice != 0) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Nhap sai chuc nang, nhap lai: ");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter new TelephoneNumber:");
                        phoneNumber = Integer.parseInt(scanner.nextLine());
                        employee.setPhoneNumber(phoneNumber);
                        disPlay();
                        break;
                    case 2:
                        System.out.println("Email moi:");
                        email = scanner.nextLine();
                        employee.setEmail(email);
                        disPlay();
                        break;
                    case 3:
                        String position;
                        System.out.println("Chuc vu moi: ");
                        try {
                            position = scanner.nextLine();
                            employee.setPosition(position);
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        disPlay();
                        break;
                    case 4:
                        double salary = 0;
                        System.out.println("Luong moi: ");
                        try {
                            salary = Double.parseDouble(scanner.nextLine());
                            employee.setSalary(salary);
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
//                        employee.setPosition(salary);
                        disPlay();
                        break;
                    case 5:
                        disPlay();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            edit();
        }
        ReadAndWrite.writeFile(employeeList, "src\\casestudy\\data\\employee.csv");

    }

    @Override
    public void delete() {

    }
}
