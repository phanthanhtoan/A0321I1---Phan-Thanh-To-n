package bai13.baitap.tim_chuoi_tang_co_do_dai_max;

import java.util.LinkedList;
import java.util.Scanner;

public class StringSeriesMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NHap chuoi : ");
        String string = sc.nextLine();

        LinkedList<Character> max = new LinkedList<Character>();

        //Find the maximum increasingly ordered subsequence
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max) {
            System.out.println(character);
        }
        System.out.println();
    }
}
