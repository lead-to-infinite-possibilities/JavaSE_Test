package com.heima;
/**
 *案例7方法3
 */
public class demo7_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            if(i==1)    flag = false;
            for (int j = 2 ;j <= i/2; j++) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总数为"+count);
    }
}
