package bai1_Introduction_to_Java.baitap;


import java.util.Scanner;

public class bt_docsothanhchu {
        final static String[] ONES ={" ", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
                "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN" };

        final static String[] TENS = {" ", " ", "TWENTY", "THIRTY", "FORTY", "FIFTY","SIXTY", "SEVEMTY", "EIGHTY", "NINETY"};

        public static  void readNumber(int num, String value){
            System.out.print(num>19 ? TENS[num/10]+ " "+ ONES[num%10]: ONES[num]);
            System.out.print(num>0 ? value: "");
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cần đổi: ");
        int num = scanner.nextInt();
        readNumber(((num/100)%100), "HUNDRED AND ");
        readNumber(num%100, "");
    }
}
