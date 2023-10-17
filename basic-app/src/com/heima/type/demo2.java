package com.heima.type;
/**
 表达式自动类型转换
 */
public class demo2 {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        int c = 100;
        long d = a + b + c;
        System.out.println(d);
        double e = a + b + 1.0;
        System.out.println(e);
        char f = 'a';
        int g = f + 10;
        System.out.println(g);
    }
}
