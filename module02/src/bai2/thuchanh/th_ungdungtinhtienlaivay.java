package bai2.thuchanh;

import java.util.Scanner;

public class th_ungdungtinhtienlaivay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amoumnt: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter anual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i=0; i< month; i++){
            total_interest += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total of interest: "+total_interest);
    }
}
