package com.heima.parameter;

import java.util.Scanner;

/**
 * 引用参数传递案例1
 */
public class demo3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = read.nextInt();
        }
        printArray(a);

        int[] b = null;
        printArray(b);

        int[] c = {};
        printArray(c);
    }
    public static void printArray(int[] a){
        if(a==null){
            return;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            /*if(i!=a.length-1){
                System.out.print(a[i]+",");
            }else {
                System.out.print(a[i]);
            }*/
            System.out.print((i!=a.length-1)?(a[i]+","):a[i]);
        }
        System.out.print("]");
    }
}
