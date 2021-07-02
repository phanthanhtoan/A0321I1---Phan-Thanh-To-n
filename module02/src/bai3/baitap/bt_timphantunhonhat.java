package bai3.baitap;

public class bt_timphantunhonhat {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        System.out.println(min);
    }
}

