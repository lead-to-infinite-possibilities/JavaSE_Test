package com.heima.memory;
/**
 *数组变量存储地址为null
 */
public class demo3 {
    public static void main(String[] args) {
        int[] a1 = {11,22,33};
        int[] a2 = a1;
        System.out.println(a2);
        a2 = null;
        System.out.println(a2);
    }
}
