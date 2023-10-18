package com.heima.define;
/**
 * 方法的其他形式
 */
public class demo2 {
    public static void main(String[] args) {
        printHelloWorld();
        printHelloN(5);

    }

    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("hello,world");
        }
        return ;
    }
    public static void printHelloN(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("hello,world");
        }
    }
}
