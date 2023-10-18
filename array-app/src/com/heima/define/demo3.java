package com.heima.define;
/**
 * 数组的遍历
 */
public class demo3 {
    public static void main(String[] args) {
        int[] a = {100,200,300,400,500};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
