package cn.cg.java.algorithm;

import java.util.Scanner;

/**
 * @author: Gavin
 * @title: 递归计算阶乘
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/8 9:29
 */
public class factorial {

    static int factorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("请输入需要查找的阶乘：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i + "的阶乘是" + factorial(i));

    }
}
