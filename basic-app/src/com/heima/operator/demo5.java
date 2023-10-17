package com.heima.operator;
/**
 赋值运算符
 */
public class demo5 {
    public static void main(String[] args) {
        double a = 10.5;
        int b = 3;
        a+=b;
        System.out.println(a);
        b+=a;
        System.out.println(b);
        b*=a;
        System.out.println(b);
        b/=a;
        System.out.println(b);
        a%=b;
        System.out.println(a);
    }
}
