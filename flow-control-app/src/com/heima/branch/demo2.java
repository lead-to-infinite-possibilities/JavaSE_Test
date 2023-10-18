package com.heima.branch;

/**
 分支结构switch
 */
public class demo2 {
    public static void main(String[] args) {
        String day = "周三";
        switch (day) {
            case "周一":
                System.out.println("BUG");
                break;
            case "周二":
                System.out.println("HELP");
                break;
            case "周三":
                System.out.println("EAT");
                break;
            case "周四":
                System.out.println("HELP");
                break;
            case "周五":
                System.out.println("GAME");
                break;
            case "周六":
                System.out.println("LOVE");
                break;
            case "周日":
                System.out.println("WORK");
                break;
            default:
                System.out.println("输入的信息有误");
        }
    }
}
