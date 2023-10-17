package com.heima.operator;
/**
 逻辑运算符
 */
public class demo8 {
    public static void main(String[] args) {
        int a = 100,b = 90;
        int max1 = a>b ? a : b;
        System.out.println(max1);
        int c = 70;
        int max2 = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max2);
    }
}
