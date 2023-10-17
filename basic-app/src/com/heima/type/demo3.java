package com.heima.type;
/**
 强制类型转换
 */
public class demo3 {
    public static void main(String[] args) {
        int a = 250;
        int b = 100;
        byte c = (byte)a;
        byte d = (byte)b;
        System.out.println(c);
        System.out.println(d);
        char e = (char) b;
        System.out.println(e);
        double h = 99.5;
        int i = (int)h;
        System.out.println(i);
    }
}
