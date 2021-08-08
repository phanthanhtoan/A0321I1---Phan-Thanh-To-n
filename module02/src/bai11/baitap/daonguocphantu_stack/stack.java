package bai11.baitap.daonguocphantu_stack;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu a["+i+"] : ");
            array[i] = sc.nextInt();
            stack.push(array[i]);
        }
        System.out.println("so dao nguoc la: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println();
        sc.nextLine();
        System.out.print("Nhap chuoi: ");
        String mWord = sc.nextLine();

        Stack<Character> wStasck = new Stack<>();
        for (int i=0; i<mWord.length(); i++){
            wStasck.push(mWord.charAt(i));
        }

        System.out.println("Chuoi dao nguoc la: ");
        while (!wStasck.isEmpty()){
            System.out.println(wStasck.pop());
        }
    }
}
