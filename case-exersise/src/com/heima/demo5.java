package com.heima;
/**
 *案例5
 */
public class demo5 {
    public static void main(String[] args) {
        int[] a1 = {11,22,33,44,55};
        int[] a2 = copy(a1);
        printArray(a2);
    }
    public static void printArray(int[] a2) {
        System.out.print("[");
        for (int i = 0; i < a2.length; i++) {
            System.out.print((i != a2.length - 1) ? (a2[i] + ",") : a2[i]);
        }
        System.out.print("]");
    }
    private static int[] copy(int[] a1) {
        int[] a2 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
        return a2;
    }
}
