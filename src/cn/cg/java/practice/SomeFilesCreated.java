package cn.cg.java.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/11/6 11:34
 */
public class SomeFilesCreated {
    public static void main(String[] args) throws IOException {
        String parent="d:\\aaa";
        String child="bbb";
        String kid="d:\\aaa\\ccc.txt";
        File f1=new File(parent,child);
        File f2=new File(kid);
        System.out.println(f1.getAbsolutePath());
       if (!f1.exists()){
           f1.mkdirs();
       };
       if (!f2.exists()){
           f2.createNewFile();

       }
       File f=new File("d:\\");
//打印文件名字
//        String[] files = f.list();
//        for (String f0:files
//             ) {
//            System.out.println(f0);
//        }
// 打印文件路径
        File[] files = f.listFiles();
        for (File f0:files
             ) {
            System.out.println(f0);
        }


    }
}
