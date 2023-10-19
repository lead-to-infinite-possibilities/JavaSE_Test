package com.heima;

import java.util.Scanner;

/**
 *案例1
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int month = read.nextInt();
        double money = read.nextDouble();
        String type = read.next();
        if (type == "头等舱" || type == "经济舱") {
            System.out.println("输入的机票类型错误");
            return;
        }
        System.out.println("优惠后的价格为：" + calculate(month, money, type));
    }

    public static double calculate(int month, double money, String type) {
        /*if (month >= 5 && month <= 10) {
            if (type == "头等舱") {
                return money * 0.9;
            }
            else {
                return money * 0.85;
            }
        }
        else {
            if (type == "头等舱") {
                return money * 0.7;
            }
            else {
                return money * 0.65;
            }
        }
        return -1;*/
        if (month >= 5 && month <= 10) {
            switch(type){
                case "头等舱":
                    money*=0.9;
                    break;
                case "经济舱":
                    money*=0.85;
                    break;
            }
        }
        else {
            switch(type){
                case "头等舱":
                    money*=0.7;
                break;
                case "经济舱":
                    money*=0.65;
                    break;
            }
        }
        return money;
    }
}
