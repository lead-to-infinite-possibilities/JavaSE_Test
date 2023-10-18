package com.heima.branch;

/**
 switch注意事项
 */
public class demo3 {
    public static void main(String[] args) {
        String day = "周三";
        switch (day) {
            case "周一":
                System.out.println("BUG");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("HELP");
                break;
            case "周五":
                System.out.println("CODE");
                break;
            case "周六":
            case "周日":
                System.out.println("GAME");
                break;
            default:
                System.out.println("输入的信息有误");
        }
    }
}