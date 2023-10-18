package com.heima.parameter;
/**
 * 参数传递——值传递
 */
public class demo1 {
    public static void main(String[] args) {
        int a = 10;
        change(10);
        System.out.println(a);  //10
    }
    public static void change(int a){
        System.out.println(a);  //10
        a = 20;
        System.out.println(a);  //20
    }
}
