package com.heima.define;

/**
 * 动态初始化数组
 */
public class demo5 {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        int[] b = new int[10];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[n - 1]);
        a[0] = 100;
        System.out.println(a[0]);
        //默认值验证
        byte[] a1 = new byte[5];
        short[] a2 = new short[5];
        int[] a3 = new int[5];
        long[] a4 = new long[5];
        char[] a5 = new char[5];
        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a3[0]);
        System.out.println(a4[0]);
        System.out.print(a5[0]);
        System.out.println((int)a5[0]);
        float[] a6 = new float[5];
        double[] a7 = new double[5];
        System.out.println(a6[0]);
        System.out.println(a7[0]);
        boolean[] a8 = new boolean[5];
        System.out.println(a8[0]);
        String[] a9 = new String[5];
        System.out.println(a9[0]);
    }
}
