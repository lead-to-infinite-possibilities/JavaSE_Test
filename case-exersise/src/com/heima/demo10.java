package com.heima;

import java.util.Random;
import java.util.Scanner;

/**
 *案例10
 */
public class demo10 {
    public static void main(String[] args) {
        int[] userSelect = userSelectNumbers();
        int[] luckeyNumbers = generateLuckeyNumbers();
        guess(userSelect,luckeyNumbers);
    }
    public static void guess(int[] userSelect, int[] luckeyNumbers) {
        System.out.println("中奖号码为：");
        System.out.print("red: ");
        for (int i = 0;i < 6;i++) {
            System.out.print(luckeyNumbers[i]+" ");
        }
        System.out.println();
        System.out.println("blue: "+luckeyNumbers[6]);

        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(userSelect[i] == luckeyNumbers[j]){
                    flag1++;
                }
            }
        }
        if(userSelect[6] == luckeyNumbers[6]){
            flag2++;
        }
        if(flag1 == 6&&flag2==1){
            System.out.println("win1");
        } else if (flag1 == 6) {
            System.out.println("win2");
        }else if (flag1 == 5&&flag2==1) {
            System.out.println("win3");
        }else if (flag1 == 5||flag1 == 4&&flag2==1) {
            System.out.println("win4");
        }else if (flag1 == 4||flag1 == 3&&flag2==1) {
            System.out.println("win5");
        } else if (flag2==1) {
            System.out.println("win6");
        } else{
            System.out.println("not win");
        }
    }
    public static int[] generateLuckeyNumbers() {
        int[] number = new int[7];
        Random rand = new Random();
        /*
        //随机打乱33个球，抽前六个球，运行效率更高但代码复杂
        int[] red = new int[33];
        for (int i = 0; i < 33; i++) {
            red[i] = i+1;
        }
        for (int i = 0; i < 33; i++) {
            int flag = rand.nextInt(1,34);  //1~33号
            int temp = red[i];
            red[i] = red[flag];
            red[flag] = temp;
        }
        for (int i = 0; i < 6; i++) {
            number[i] = red[i];
        }*/
        for (int i = 0; i < 6; i++) {
            while(true){
                number[i] = rand.nextInt(1,34);
                if(check(number,i)){
                    break;
                }
            }
        }
        number[6] = rand.nextInt(1,17);     //1~16号
        return number;
    }
    public static int[] userSelectNumbers() {
        int[] number = new int[7];
        Scanner read = new Scanner(System.in);
        //先六红后一蓝
        System.out.print("red: ");
        for (int i = 0; i < 6; i++) {
            while(true){
                number[i] = read.nextInt();
                if(number[i]>33||number[i]<1){
                    System.out.println("该球号码范围不对，请重新输入该球的号码");
                    continue;
                }
                if(check(number,i)){
                    break;
                }else{
                    System.out.println("该球号码重复，请重新输入该球的号码");
                }
            }
        }
        System.out.print("blue: ");
        while(true){
            number[6] = read.nextInt();
            if(number[6]>16||number[6]<1){
                System.out.println("该球号码范围不对，请重新输入该球的号码");
                number[6] = read.nextInt();
            }
            break;
        }
        return number;
    }
    public static boolean check(int[] number, int i) {
        if(i == 0)  return true;
        for (int j = 0; j < i; j++) {
            if(number[i] == number[j]){
                return false;
            }
        }
        return true;
    }
}
