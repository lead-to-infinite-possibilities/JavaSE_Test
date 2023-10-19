package com.heima;

import java.util.Scanner;

/**
 *案例9变体1
 */
public class demo9_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2 - 1; j++) {
                System.out.print((j%2==0)?" ":"*");
            }
            System.out.println();
        }
    }
}
