package bai16.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args)   {
//        //cách 1
//        try {
//            java.io.FileWriter fileWriter = new java.io.FileWriter("Test.txt");
//            fileWriter.write("Hello every one");
//            fileWriter.write("\r\n");
//            fileWriter.write("From Toan with love");
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Loi ghi file");
//        }

        //cách2
        try {
             FileWriter fileWriter = new FileWriter("Test.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Product product = new Product("Toan", 20000,"abc");
            bufferedWriter.write(product.toString());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
