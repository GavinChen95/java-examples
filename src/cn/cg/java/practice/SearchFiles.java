package cn.cg.java.practice;

import java.io.File;

/**
 * @author: Gavin
 * @title: 根据文件格式（后缀）搜索文件
 * @Package: cn.cg.java.practice
 * @date: 2019/11/6 17:38
 */
public class SearchFiles {
    public static void main(String[] args) {
        String name = "c:\\";
        File file = new File(name);
        searchFiles(file);

    }

    private static void searchFiles(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files
                    ) {
                if (f.isFile()) {
                    if (f.getName().endsWith(".jar")) {
                        System.out.println(f.getAbsolutePath());
                    }
                } else {
                    searchFiles(f);
                }
            }
        }
    }
}
