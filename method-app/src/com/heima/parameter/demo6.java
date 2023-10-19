package com.heima.parameter;
/**
 * 引用参数传递案例4
 */
public class demo6 {
    public static void main(String[] args) {
        int[] a = {11,22,33};

    }
    public static int search(int[] a,int x){
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                index = i;
                return index;
            }
        }
        return index;
    }
}
