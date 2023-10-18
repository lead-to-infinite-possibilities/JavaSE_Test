package com.heima.random;

import java.util.Random;

/**
 * random随机数
 */
public class demo1 {
    public static void main(String[] args) {
        //0-某数的区间随机数
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(10);  //生成0-9之间的随机数
            System.out.println(number);
        }
        System.out.println();
        //指定区间随机数
        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(9) + 1;
            //生成1-9之间的随机数,即(0~8)+1
            System.out.println(number);
        }
        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(1,10);
            //生成1-9之间的随机数
            System.out.println(number);
        }
    }
}
