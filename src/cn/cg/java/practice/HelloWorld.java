package cn.cg.java.practice;

import java.util.concurrent.locks.Lock;

/**
 * @author: Gavin
 * @title: 编译java文件
 * @Package: cn.cg.java
 * @date: 2019/9/15 11:35
 */
public class HelloWorld {
    public static void main(String []args) {
        System.out.println("Hello World");
//        System.out.println(Math.ceil(-11.1));//-12
//        System.out.println(Math.ceil(11.1));//11
//        System.out.println(Math.round(-11.1));//-11
//        System.out.println(Math.round(-11.6));//-12
//
        String s="hello";
        s=s+"world";
        System.out.println(s);

        System.out.println("10"+2+'1');

        String a="10";
        String b="1";
        char c=1111;
        System.out.println(a+b+c);



        int a1=101/100;
        System.out.println(a1);


    }
}