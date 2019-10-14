package cn.cg.java.practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/12 23:58
 */
public class Hashset {
    public static void main(String[] args) {
        Set<Student> stringSet = new HashSet<>();

        Student student=new Student();
        student.setName("张三");
        student.setAge(18);

        stringSet.add(new Student("李四",20));
        stringSet.add(new Student("李四",20));
        stringSet.add(student);


        for (Student st:stringSet
             ) {
            System.out.println(st);
        }






    }

}
