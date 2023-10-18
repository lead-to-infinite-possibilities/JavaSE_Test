package com.heima.define;
/**
 * 方法的定义
 */
public class demo1 {
    public static void main(String[] args) {
        int rs1 = sum(10, 20);
        int rs2 = sum(30, 20);
        System.out.println(rs1);
        System.out.println(rs2);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
