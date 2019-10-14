package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 有一个100以内的整数，它加上100后是一个完全平方数，再加上168后也是一个完全平方数，求这个整数。
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/7 23:15
 */
public class squares {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            int a = (int) Math.sqrt(i + 100);
            int b = (int) Math.sqrt(i + 100 + 168);
            if (a * a == i + 100 && b * b == i + 100 + 168) {
                System.out.println(i);
            }
        }
    }
}
