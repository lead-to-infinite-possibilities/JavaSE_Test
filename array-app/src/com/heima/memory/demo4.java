package com.heima.memory;

import java.util.Random;
import java.util.Scanner;

/**
 *数组案例
 */
public class demo4 {
    public static void main(String[] args) {
        //案例1
        int[] score = {15, 9000, 10000, 20000, 9500, -5};
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] >= max) {
                max = score[i];
            }
        }
        System.out.println(max);

        //案例2
        int[] a = {10, 20, 30, 40, 50};
        /*for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }*/
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        for (int i : a) {
            System.out.println(i);
        }

        //案例3
        int[] id = new int[5];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < id.length; i++) {
            id[i] = read.nextInt();
        }
        Random rand = new Random();
        for (int i = 0; i < id.length; i++) {
            int index = rand.nextInt(id.length);
            int temp = id[i];
            id[i] = id[index];
            id[index] = temp;
        }
        for (int i : id) {
            System.out.println(i);
        }
    }
}
