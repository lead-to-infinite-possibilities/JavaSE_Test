package com.heima.loop;

/**
 * 嵌套循环与其案例
 */
public class demo7 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("love you");
            }
        }
        //案例1
        for (int i = 0; i < 4; i++) {
            System.out.println("*****");
        }
        //案例2
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

