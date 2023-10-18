package com.heima.example;

import java.util.Scanner;

/**
 * 案例2
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        check(x);
    }
    public static void check(int x){
        if(x%2==1){
            System.out.println(x+"为偶数");
        }
        else{
            System.out.println(x+"为奇数");
        }
    }
}
