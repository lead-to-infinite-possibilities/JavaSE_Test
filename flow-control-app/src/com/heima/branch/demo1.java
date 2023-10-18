package com.heima.branch;

/**
 分支结构if
 */
public class demo1 {
    public static void main(String[] args) {
        double t = 38.9;
        if (t > 37) {
            System.out.println("Warning");
        }

        double money = 98;
        if (money > 90) {
            System.out.println("OK");
        } else {
            System.out.println("False");
        }

        double score = 95;
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else if (score >= 0) {
            System.out.println("E");
        } else {
            System.out.println("Error");
        }
    }
}
