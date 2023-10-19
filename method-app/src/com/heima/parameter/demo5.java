package com.heima.parameter;

import java.util.Scanner;

/**
 * 引用参数传递案例3
 */
public class demo5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = read.nextInt();
        }
        if(a == null || a.length == 0){
            System.out.println("最大值不存在");
        }else{
            System.out.println("max = "+max(a));
        }
    }
    public static int max(int[] a){
        int max = a[0];
        for(int i: a){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
