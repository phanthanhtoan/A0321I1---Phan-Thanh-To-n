package bai16.baitap.CopyFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File inputFile = new File("src/bai16/baitap/CopyFile/abc.txt");
        File outFile = new File("src/bai16/baitap/CopyFile/abcxyz.txt");

        if (!inputFile.exists()){
            System.out.println("File khong ton tai");
        }else {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFile));
                String line ="";
                while ((line = bufferedReader.readLine())!= null){
                    bufferedWriter.write(line +"\n");
                }
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
