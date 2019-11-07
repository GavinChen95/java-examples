package cn.cg.java.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: Gavin
 * @title: io中的字符流读写操作
 * @Package: cn.cg.java.practice
 * @date: 2019/11/7 8:29
 */
public class ReadAndWrite {
    public static void main(String[] args) {
        String name="d:\\aaa";
        File f=new File(name);
        searchFiles(f);
        try {
            FileWriter fileWriter=new FileWriter("d:\\aaa\\ccc.txt");
            fileWriter.write("我来自美丽的");
            fileWriter.write("中国");
            fileWriter.close();

            FileReader fileReader=new FileReader("d:\\aaa\\ccc.txt");
            int a;
            while ((a=fileReader.read())!=-1){
                System.out.print((char) a);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 查找文件的方法
     * @param file
     */
    private static void searchFiles(File file){
        File[] files = file.listFiles();
        ArrayList<String> strings=new ArrayList<>();
        for (File f:files
             ) {
            if (f.getName().endsWith(".txt")){
                strings.add(f.getName());
                System.out.println(f.getAbsolutePath());
            }else{
                searchFiles(f);
            }
        }

        for (String str:strings
             ) {
            System.out.println(str);
        }
    }

}
