package cn.cg.java.practice;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: Gavin
 * @title: Properties类的使用
 * @Package: cn.cg.java.practice
 * @date: 2019/11/10 13:50
 */
public class ProDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("name","Gavin");
        properties.setProperty("age","24");
        properties.setProperty("gender","male");

        Set<String> stringSet = properties.stringPropertyNames();
        for (String s:stringSet
             ) {
            System.out.println(s+":"+properties.getProperty(s));
        }
    }
}
