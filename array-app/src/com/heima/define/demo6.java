package com.heima.define;

import java.util.Scanner;

/**
 * 动态初始化数组案例
 */
public class demo6 {
    public static void main(String[] args) {
        //案例1
        double[] a = new double[6];
        Scanner read = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = read.nextDouble();
            sum+=a[i];
        }
        double ave = sum/a.length;
        System.out.println(ave);
        //案例2
        int count = 0;
        double[] score = new double[6];
        for (int i = 0; i < score.length; i++) {
            score[i] = read.nextDouble();
            if(score[i]>=60)   {
                count++;
            }
        }
        System.out.println(count);
    }
}
