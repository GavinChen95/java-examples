package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/8 9:18
 */
public class daffodil {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i - 100 * a) / 10;
            int c = i - 100 * a - 10 * b;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }

        }
    }

}
