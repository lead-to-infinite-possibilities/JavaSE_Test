package com.heima.example;

import java.util.Scanner;

/**
 * 案例1
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int s = sum(n);
        System.out.println(s);
    }
    public static int sum(int n){
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s+=i;
        }
        return s;
    }
}
