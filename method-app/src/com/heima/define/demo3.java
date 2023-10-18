package com.heima.define;
/**
 * 方法的常见问题
 */
public class demo3 {
    public static void main(String[] args) {
        int sum = sum(1,2);
        System.out.println(sum);

        System.out.println(sum(1,2));

        sum(1,2);

        hello();
    }
    public static int sum(int a,int b){
        int c = a+b;
        return c;
    }
    public static void hello(){
        System.out.println("hello");
    }
}
