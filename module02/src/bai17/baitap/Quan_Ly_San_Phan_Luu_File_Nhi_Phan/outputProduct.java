package bai17.baitap.Quan_Ly_San_Phan_Luu_File_Nhi_Phan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class outputProduct {
    public static void main(String[] args) {
        Product product = new Product();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/bai17/baitap/Quan_Ly_San_Phan_Luu_File_Nhi_Phan/abc.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            List<Product> products = new ArrayList<>();
            Product product1 = new Product(1, "Washing machine", "Sam Sung", 5000000, "Clean your clothes");
            Product product2 = new Product(2, "Refrigerator", "Toshiba", 4000000, "Freeze everything");

            products.add(product1);
            products.add(product2);

            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
