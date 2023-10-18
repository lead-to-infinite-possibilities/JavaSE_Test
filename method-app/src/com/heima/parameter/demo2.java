package com.heima.parameter;
/**
 * 参数传递——引用传递
 */
public class demo2 {
    public static void main(String[] args) {
        int[] a = {11,22,33};
        change(a);
        System.out.println(a[1]);
    }
    public static void change(int[] a){
        System.out.println(a[1]);
        a[1] = 55;
        System.out.println(a[1]);
    }
}
