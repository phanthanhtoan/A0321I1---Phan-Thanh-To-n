package bai16.Optional.Docfile_csv;

import java.io.*;

public class ReadFileCsv {
    public static  void main (String[] args){
        String demo = "E:\\A0321I1 - Phan Thanh Toan\\A0321I1---Phan-Thanh-Toan\\module02\\src\\bai16\\Optional\\Docfile_csv\\toan.csv";
        String line ="";
        final String CsvSplitBy = ",";
        WriteCsv(demo);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(demo));
            while ((line = bufferedReader.readLine())!=null){
                String[] country = line.split(CsvSplitBy);
                System.out.println("Code "+ country[5] + " name " +country[5]);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteCsv(String path){
        try {
            Country country = new Country("1.0.0.0", "1.0.7.255", "1312321321", "312321321","Vn", "VietNam");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false));
            bufferedWriter.write(country.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
