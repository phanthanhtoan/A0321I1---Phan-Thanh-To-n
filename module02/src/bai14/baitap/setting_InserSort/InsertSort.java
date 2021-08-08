package bai14.baitap.setting_InserSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertSort = array[i];
            int j = -1;
            for (; j >= 0 && array[j] > insertSort; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = insertSort;
        }
    }

    public static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        insertSort(arr);
        printArray(arr);
    }
}
