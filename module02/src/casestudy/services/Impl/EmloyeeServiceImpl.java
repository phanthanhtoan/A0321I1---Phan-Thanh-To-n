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


    public Employee checkExist(String id) {
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getId(), id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void disPlay() {
        employeeList = (List<Employee>) ReadAndWrite.readFile("src\\casestudy\\data\\employee.csv");
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
        ReadAndWrite.writeFile(employeeList, "src\\casestudy\\data\\employee.csv");
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        String id;
        do {
            System.out.println("Nhap id nhan vien can sua:  ");
            id = scanner.nextLine();
            if (checkExist(id) == null) {
                System.out.println("Id nhan vien khong ton tai ");
            }
        } while (checkExist(id) == null);
        Employee employee = (Employee) checkExist(id);
        int choice = -1;
        do {
            System.out.println("Nhap id nhan vien can sua: ");
            System.out.println("1. Ten ");
            System.out.println("2. Tuoi ");
            System.out.println("3. Dia chi ");
            System.out.println("4. SDT ");
            System.out.println("5. Email ");
            System.out.println("6. Chuc vu ");
            System.out.println("7. Luong ");
            System.out.println("8. Tro ve menu ");
            System.out.println("Lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten moi: ");
                    String name = scanner.nextLine();
                    employee.setName(name);
                    break;
                case 2:
                    System.out.println("Nhap tuoi moi: ");
                    int age = scanner.nextInt();
                    employee.setAge(age);
                    break;
                case 3:
                    System.out.println("Nhap dia chi moi: ");
                    String address = scanner.nextLine();
                    employee.setAddress(address);
                    break;
                case 4:
                    System.out.println("Nhap SDT moi: ");
                    int phoneNumber = scanner.nextInt();
                    employee.setPhoneNumber(phoneNumber);
                    break;
                case 5:
                    System.out.println("Nhap Email moi: ");
                    String email = scanner.nextLine();
                    employee.setEmail(email);
                    break;
                case 6:
                    System.out.println("Nhap chuc vu moi: ");
                    String position = scanner.nextLine();
                    employee.setPosition(position);
                    break;
                case 7:
                    System.out.println("Nhap luong moi: ");
                    Double salary = scanner.nextDouble();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lua chon sai! Chon lai");
            }

        } while (true);
    }

    @Override
    public void delete() {

    }
}
