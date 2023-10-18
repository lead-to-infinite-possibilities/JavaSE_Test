package com.heima.random;

import java.util.Random;
import java.util.Scanner;

/**
 * random案例
 */
public class demo2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int end = rand.nextInt(100) + 1;
        Scanner read = new Scanner(System.in);
        while(true){
            int number = read.nextInt();
            if(number > end){
                System.out.println("too big");
            } else if (number<end) {
                System.out.println("too small");
            }else {
                System.out.println("win");
                break;
            }
        }
    }
}
