package bai12.baitap.ArrayList_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
     static List<Product> productList;
     static Scanner sc = new Scanner(System.in);

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Akko Tokyo World tour 3084", 1700000, "Ngon"));
        productList.add(new Product(2, "Edra Ek387 Pro Gateron", 1300000, "Te"));
        productList.add(new Product(3, "Leopold FC980M", 3600000, "Ngon"));
        productList.add(new Product(4, "CYBERBOARD", 4000000, "Te"));
        productList.add(new Product(5, " Keychron K2", 1700000, "Vip"));
    }

    public static void menu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("---XAY DUNG LOP PRODUCT ARRAYLIST---"
                    + "\n1. In danh sách sản phẩm : "
                    + "\n2. Thêm : "
                    + "\n3. Sửa theo id : "
                    + "\n4. Xóa theo id : "
                    + "\n5. Tìm kiếm sản phẩm : "
                    + "\n6. Sắp xếp tăng dần, giảm dần theo giá : "
                    + "\n0. Thoát chương trình!");
            System.out.print("Chọn : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 0:
                    System.out.println("Thoát thành công!");
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn sai phép tính. Chọn lại hoặc thoát khỏi chương trình!");
            }
        }
    }

    public static boolean checkID(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void showProduct() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        sc.skip("\\R");
        System.out.print("Tên sản phẩm : ");
        String nameProduct = sc.nextLine();
        System.out.print("Giá : ");
        double price = sc.nextDouble();
        sc.skip("\\R");
        System.out.print("Mô tả : ");
        String description = sc.nextLine();
        Product product = new Product(id, nameProduct, price, description);
        productList.add(product);
    }

    public static void editProduct() {
        System.out.print("Nhập ID : ");
        int id= Integer.parseInt(sc.nextLine());
        int choice = -1;
        if (checkID(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(id).getId()) {
                    System.out.println("Nhập thông tin cần sửa:"
                            + "\n1. Tên : "
                            + "\n2. Giá : "
                            + "\n3. Mô tả : "
                            + "\n0. --Menu-- ");
                }
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Tên mới : ");
                        String nameProduct = sc.nextLine();
                        productList.get(i).setNameProduct(nameProduct);
                        break;
                    case 2:
                        System.out.print("Giá mới : ");
                        double price = Double.parseDouble(sc.nextLine());
                        productList.get(i).setPrice(price);
                        break;
                    case 3:
                        System.out.println("Enter new description : ");
                        String description = sc.nextLine();
                        productList.get(i).setDescription(description);
                        break;
                    case 4:
                        menu();
                        break;
                }
            }
        } else {
            System.out.println("Không tìm thấy ID !!!");
            menu();
        }
    }

    public static void deleteProduct() {
        System.out.println("Nhập ID cần xóa : ");
        int id = Integer.parseInt(sc.nextLine());
        if (checkID(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(id).getId()) {
                    productList.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("Không tìm thấy ID !!!");
            menu();
        }
    }

    public static void searchProduct() {
        System.out.println("Nhập ID cần tìm : ");
        int id = Integer.parseInt(sc.nextLine());
        if (checkID(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    System.out.println(productList.get(i).toString());
                    break;
                }
            }
        } else {
            System.out.println("Không tìm thấy ID !!! ");
            menu();
        }
    }

    public static void sortProduct() {
        Product product = new Product();
        productList.sort(product);
        for (Product pt : productList) {
            System.out.println(pt.toString());
        }
    }
}
