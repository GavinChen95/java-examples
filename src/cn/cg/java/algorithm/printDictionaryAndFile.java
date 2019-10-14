package cn.cg.java.algorithm;

import java.io.File;

/**
 * @author: Gavin
 * @title: 打印D盘下的所有文件和文件夹，递归打印子文件夹
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/8 9:45
 */
public class printDictionaryAndFile {
    public static void main(String[] args) {
        String path = "C:\\";
        File file = new File(path);
        File[] tempList = file.listFiles();


        System.out.println("该目录下对象个数：" + tempList.length);
         // 打印文件及文件夹（文件夹内的子文件不打印）
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文     件：" + tempList[i]);
            }
            if (tempList[i].isDirectory()) {
                System.out.println("文件夹：" + tempList[i]);
            }
        }
    }

}
