package bai17.baitap.Quan_Ly_San_Phan_Luu_File_Nhi_Phan;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class inputProduct {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/bai17/baitap/Quan_Ly_San_Phan_Luu_File_Nhi_Phan/abc.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> products = (List<Product>) objectInputStream.readObject();

            for (Product product : products) {
                System.out.println(product);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
