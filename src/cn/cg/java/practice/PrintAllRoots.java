package cn.cg.java.practice;

import com.sun.istack.internal.NotNull;

import java.io.File;

/**
 * @author: Gavin
 * @title: 递归打印所有目录和文件
 * @Package: cn.cg.java.practice
 * @date: 2019/11/6 17:15
 */
public class PrintAllRoots {
    public static void main(String[] args) {
        String name = "d:\\";
        File file = new File(name);
        printAll(file);
    }

    private static void printAll(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File f : listFiles
                    ) {
                if (f.isDirectory()) {
                    System.out.println("目录是" + f.getAbsolutePath());
                    printAll(f);
                }
                if (f.isFile()) {
                    System.out.println("文件是" + f.getAbsolutePath());

                }

            }

        }
    }
}

