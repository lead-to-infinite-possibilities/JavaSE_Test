package com.heima.scanner;
import java.util.Scanner;
/**
 Scanner API
 */
public class demo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        System.out.println(a+1);
        System.out.println((int)-1.5);
    }
}
