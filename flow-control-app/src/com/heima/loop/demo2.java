package com.heima.loop;

import static java.lang.Math.pow;

/**
 * for案例
 */
public class demo2 {
    public static void main(String[] args) {
        //案例1
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i + 1;
        }
        System.out.println(sum);

        //案例2方法1
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum1+=i;
            }
        }
        System.out.println(sum1);

        //案例2方法2
        int sum2 = 0;
        for (int i = 1; i <= 100; i+=2) {
                sum2+=i;
        }
        System.out.println(sum2);

        //案例3
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if(pow(i%10,3)+pow(i/10%10,3)+pow(i/10/10%10,3)==i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总数为："+count);
    }
}
