package cn.cg.java.algorithm;

import java.util.Scanner;

/**
 * @author: Gavin
 * @title: 将数组中存放的元素颠倒过来
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/9 11:19
 */
public class ReverseOfArray {
    public static void main(String[] args) {
        System.out.print("请输入数组的长度:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        //随机获得长度为size的数组元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        //遍历原始数组arr1
        System.out.print("这个随机数组是：");
        for (int arr1 : arr
                ) {
            System.out.print(arr1 + " ");
        }

        System.out.println();
        System.out.print("进行顺序颠倒后的数组是：");
        //arr数组中元素颠倒
        for (int j = 0; j < (arr.length) / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - 1 - j] = temp;
        }
        //遍历颠倒顺序后的数组arr2
        for (int arr2 : arr
                ) {
            System.out.print(arr2 + " ");

        }
    }

}
