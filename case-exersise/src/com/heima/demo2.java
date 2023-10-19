package com.heima;

import java.util.Random;
import java.util.Scanner;

/**
 *案例2
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(createCode(n));
    }

    public static String createCode(int n) {
        Random rand = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = rand.nextInt(3); //0~2
            switch (type) {
                case 0:
                    code += rand.nextInt(10);  //0~9 +连接符连接字符和数字
                    //code+=(char)rand.nextInt(26)+97;
                    break;
                case 1:
                    code += (char) rand.nextInt((int) 'a', (int) 'z' + 1);  //97~97+25
                    //code+=(char)rand.nextInt(26)+97;
                    break;
                default:
                    code += (char) rand.nextInt((int) 'A', (int) 'Z' + 1);  //65~65+25
                    //code+=(char)rand.nextInt(26)+65;
                    break;
            }
        }
        return code;
    }
}
