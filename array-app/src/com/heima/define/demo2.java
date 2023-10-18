package com.heima.define;
/**
 * 数组的访问
 */
public class demo2 {
    public static void main(String[] args) {
        int[] a ={112,55,489};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a.length);

        a[0] = 100;
        a[2] = 500;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
