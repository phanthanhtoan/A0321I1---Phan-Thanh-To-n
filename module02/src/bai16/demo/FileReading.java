package bai16.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReading {
    public static void main(String[] args) {
        //cách 1
//        try {
//            FileReader fileReader = new FileReader("Test.txt");
//            int character;
//            String temp="";
//            while ((character = fileReader.read())!=-1){
//                temp+= (char)character;
//            }
//            String[] pro = temp.split(",");
//            Product product = new Product(pro[0], Integer.parseInt(pro[1]), pro[2]);
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //cách 2
        try {
            FileReader fileReader = new FileReader("Test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List<Product> productList = new ArrayList<>();
            while ((line = bufferedReader.readLine())!=null){
                String[] pro = line.split(",");
                Product product = new Product(pro[0], Integer.parseInt(pro[1]), pro[2]);
                productList.add(product);
            }
            for (Product product: productList){
                System.out.println(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
