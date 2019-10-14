package cn.cg.java.algorithm;

import java.io.File;

/**
 * @author: Gavin
 * @title: 递归遍历所有文件
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/9 17:15
 */
public class printDictionaryAndAllFile {
    public static void main(String[] args) {
        String path = "D:\\";
        File file = new File(path);
        func(file);
    }
    //打印所有文件(注意这时候一定加上非空判断，不然会出现NullPointerException)
    private static void func(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files
                    ) {
                if (f.isFile()) {
                    System.out.println(f);
                }
                if (f.isDirectory()) {
                    func(f);
                }

            }
        }
    }
}
