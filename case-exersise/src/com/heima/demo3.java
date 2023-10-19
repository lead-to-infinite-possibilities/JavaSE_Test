package com.heima;

import java.util.Scanner;

/**
 *案例3
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(); //默认n>2
        double[] score = new double[n];
        score[0] = read.nextDouble();
        double max = score[0], min = score[0];
        double sum = score[0];
        for (int i = 1; i < n; i++) {
            score[i] = read.nextDouble();
            sum += score[i];
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        sum -= max + min;
        sum /= (n - 2);
        System.out.println(sum);
    }
}
