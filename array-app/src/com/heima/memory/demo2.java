package com.heima.memory;
/**
 *多个变量指向同一个数组
 */
public class demo2 {
    public static void main(String[] args) {
        int[] a1 = {11,22,33};
        int[] a2 = a1;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1[2]);
        System.out.println(a2[2]);
        a2[2] = 55;
        a1[1] = 44;
        System.out.println(a1[2]);
        System.out.println(a2[1]);
    }
}
