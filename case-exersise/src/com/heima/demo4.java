package com.heima;

import java.util.Scanner;

/**
 *案例4
 */
public class demo4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*String code = read.next();
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = (int)(code.charAt(i)-'0');
            num[i] += 5;
            num[i] %= 10;
        }
        for (int i = 0,j = num.length-1; i < j; i++,j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        code = "";
        for (int i = 0; i < 4; i++) {
            code+=num[i];
        }
        System.out.println(code);*/
        int number = read.nextInt();
        int[] num = spilit(number);
        for (int i = 0; i < num.length; i++) {
            num[i] += 5;
            num[i] %= 10;
        }
        reverse(num);
        for (int i : num) {
            System.out.print(i);
        }
    }
    public static int[] spilit(int number) {
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[3-i] = number%10;
            number/=10;
        }
        return num;
    }
    public static void reverse(int[] num) {
        for (int i = 0,j = num.length-1; i < j; i++,j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }
}
