package com.heima.operator;
/**
 ++/-- 题目进阶
 */
public class demo4 {
    public static void main(String[] args) {
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);
    }
}
