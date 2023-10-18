package com.heima.loop;

import java.util.Scanner;

/**
 * break与continue关键字+案例
 */
public class demo8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println("love you");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            System.out.println("love you");
        }
        //案例
        Scanner read = new Scanner(System.in);
        while (true) {
            int number = read.nextInt();
            if (number != 520) {
                System.out.println("密码错误");
                continue;
            } else {
                System.out.println("密码正确，欢迎进入系统");
                break;
            }
        }
    }
}