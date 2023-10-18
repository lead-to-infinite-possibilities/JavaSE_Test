package com.heima.parameter;
/**
 * 引用参数传递案例2
 */
public class demo4 {
    public static void main(String[] args) {
        int[] a1 = {11,22,33};
        int[] a2 = {11,22,33};
        System.out.println(check(a1,a2));
    }
    public static boolean check(int[]a1,int[]a2){
        if(a1==null&&a2==null){
            return true;
        }
        if(a1==null||a2==null){
            return false;
        }
        if(a1.length!=a2.length){
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}
