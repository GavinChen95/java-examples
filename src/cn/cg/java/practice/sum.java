package cn.cg.java.practice;

import java.util.Scanner;

/**
 * @author: Gavin
 * @title: 计算1~100的整数之和
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 12:05
 */
public class sum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
