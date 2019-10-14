package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 冒泡排序
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/7 22:45
 */
public class BubbleSort {
    public static void main(String[] args) {
        //设置数组的长度，为可变值a
        int a=10;
        int[] arr = new int[a];
        //随机生成一个长度为a的数组
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random() * 10+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //进行冒泡排序，将数组从小到大进行排列
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //循环遍历排序后的数组
        for (int arr1 : arr
                ) {
            System.out.print(arr1 + " ");
        }
    }
}
