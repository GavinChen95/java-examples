package cn.cg.java.algorithm;

import java.util.Arrays;

/**
 * @author: Gavin
 * @title: 打印二维数组
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/8 9:56
 */
public class printArrays2 {
    public static void main(String[] args) {
        int[][] arr2 = new int[][]{{1, 4, 3}, {0, 9, 5}};
        //打印二维数组的地址
        System.out.println(arr2.toString());

        //打印二维数组的行地址、列地址
        System.out.println(Arrays.toString(arr2));

        //打印二维数组的内容
        System.out.println(Arrays.deepToString(arr2));
    }

}
