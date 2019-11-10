package cn.cg.java.practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Gavin
 * @title: 通过缓冲流练习排序文字段落
 * @Package: cn.cg.java.practice
 * @date: 2019/11/10 16:44
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\aaa\\bbb\\陈情表.txt"));
        Map<String, String> map = new HashMap<>();

        String line = null;  //读一行
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("\\.");
            if (split.length > 1) {
                map.put(split[0], split[1]);
            }

        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\aaa\\bbb\\陈情表修订版.txt"));
        for (int i = 1; i <= map.size(); i++) {
            String k = String.valueOf(i);
            String v = map.get(k);

            bufferedWriter.write(k + "." + v);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        long l2 = System.currentTimeMillis();

        System.out.println(l2 - l1);


    }

}
