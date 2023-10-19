package com.heima;

import java.util.Random;
import java.util.Scanner;
/**
 *案例6
 */
public class demo6 {
    public static void main(String[] args) {
        int[] money = {9,666,188,520,999999};
        Scanner read = new Scanner(System.in);
        while(check(money)){
            System.out.println("start: ");
            String start = read.next();
            delete(money);
        }
        /*for (int i = 0; i < money.length; i++) {
            System.out.println("start: ");
            String start = read.next();

            Random rand = new Random();
            int n = rand.nextInt(money.length);

            if(money[n]!=0){
                System.out.println("get "+money[n]);
                money[n]=0;
            }
            else{
                while(money[n]==0){
                    n = rand.nextInt(money.length);
                }
                System.out.println("get "+money[n]);
                money[n]=0;
            }
        }*/
        System.out.println("end");
    }
    public static void delete(int[] money) {
        Random rand = new Random();
        int n = rand.nextInt(money.length);
        if(money[n]==0){
            delete(money);
        }
        else{
            System.out.println("get "+money[n]);
            money[n]=0;
        }
    }
    public static boolean check(int[] money) {
        for (int i = 0; i < money.length; i++) {
            if(money[i] != 0){
                return true;
            }
        }
        return false;
    }
}
