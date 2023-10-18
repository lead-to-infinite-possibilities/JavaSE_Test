package com.heima.overload;
/**
 * 方法重载案例
 */
public class demo2 {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("米国",10);
    }
    public static void fire(){
        System.out.println("fire(one to dao)");
    }
    public static void fire(String country){
        System.out.println("fire(one to)"+country);
    }
    public static void fire(String country,int num){
        System.out.println("fire "+num+" to "+country);
    }
}
