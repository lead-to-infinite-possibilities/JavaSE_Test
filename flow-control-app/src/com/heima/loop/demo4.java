package com.heima.loop;
/**
 * while案例
 */
public class demo4 {
    public static void main(String[] args) {
        int count = 0;
        double now = 0.1;
        while(now<8848860) {
            now *= 2;
            count++;
        }
        System.out.println(count);
    }
}
