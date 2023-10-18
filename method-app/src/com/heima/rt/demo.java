package com.heima.rt;
/**
 * 关键字return在void方法中的应用
 */
public class demo {
    public static void main(String[] args) {
        chu(1,0);
    }
    public static void chu(int a,int b){
        if(b == 0){
            System.out.println("错误");
            return ;
        }
        double c = 1.0*a/b;
        System.out.println(c);
    }
}
