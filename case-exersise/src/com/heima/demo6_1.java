package com.heima;

import java.util.Random;
import java.util.Scanner;
/**
 *案例6方法2
 */
public class demo6_1 {
    public static void main(String[] args) {
        int[] money = {9,666,188,520,999999};
        Scanner read = new Scanner(System.in);
        change(money);
        for (int i = 0; i < money.length; i++) {
            System.out.println("start");
            String start = read.next();
            System.out.println(money[i]);
        }
        System.out.println("end");
    }
    public static void change(int[] money) {
        Random rand = new Random();
        for (int i = 0; i < money.length; i++) {
            int x = rand.nextInt(money.length);
            int temp = money[i];
            money[i] = money[x];
            money[x] = temp;
        }
    }
}
