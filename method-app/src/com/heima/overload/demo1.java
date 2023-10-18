package com.heima.overload;
/**
 * 方法重载
 */
public class demo1 {
    public static void main(String[] args) {
        test();
        test(100);
    }
    public static void test(){
        System.out.println(1);
    }
    public static void test(int a){
        System.out.println(2);
    }
    public static void test(int a,int b){
        System.out.println(3);
    }
    public static void test(int a,double b){
        System.out.println(4);
    }
    public static void test(double a,int b){
        System.out.println(5);
    }
    public static void test(double a){
        System.out.println(6);
    }
}
