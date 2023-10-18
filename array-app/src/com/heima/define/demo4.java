package com.heima.define;

/**
 * 静态初始化数组案例
 */
public class demo4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] money = {16, 26, 36, 6, 100};
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
