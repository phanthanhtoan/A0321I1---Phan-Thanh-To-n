package bai11.baitap.demsolan_xuathien_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong chuỗi : ");
        int n = Integer.parseInt(sc.nextLine());
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + i + "] : ");
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; ++i) {
            if (treeMap.containsKey(strings[i])) {
                treeMap.put(strings[i], treeMap.get(strings[i]) + 1);
            } else {
                treeMap.put(strings[i], 1);
            }
        }

        //Duyet cac phan tu cua TREEMAP
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
