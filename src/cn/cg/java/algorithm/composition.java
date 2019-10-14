package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 假设有一组数字1、2、3、4，程序输出由这组数字组成的互不相同且无重复数字的三位数，控制台输出
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/7 23:30
 */
public class composition {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        d += 1;
                        System.out.print(100 * i + 10 * j + k + "  ");
                    }
                }
            }
        }
        System.out.println("一共有" + d + "个数");
    }

}
