package com.heima;

import java.util.Scanner;

/**
 *案例9
 */
public class demo9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
