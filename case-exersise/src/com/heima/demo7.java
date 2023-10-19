package com.heima;
/**
 *案例7
 */
public class demo7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            if(isNum(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总数为"+count);
    }
    public static boolean isNum(int i) {
        if(i==1)    return false;
        for (int j = 2 ;j <= i/2; j++) {
            if(i%j==0)  return false;
        }
        return true;
    }
}
