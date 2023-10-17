package com.heima.operator;
/**
 逻辑运算符
 */
public class demo7 {
    public static void main(String[] args) {
        int a = 10,b = 5;
        System.out.println(a>b & a>=b);
        System.out.println(a<b | a>b);
        System.out.println(!(a==b));
        System.out.println(a!=b ^ a==b);
        System.out.println(a<=b && a==a++);
        System.out.println(a);
        System.out.println(a==a++ || a>=b);
        System.out.println(a);
    }
}
