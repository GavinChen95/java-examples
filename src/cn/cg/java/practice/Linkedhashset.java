package cn.cg.java.practice;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/13 9:54
 */
public class Linkedhashset {
    public static void main(String[] args) {
        Set<People> peopleSet = new LinkedHashSet<>();
        peopleSet.add(new People("张三", "12"));
        System.out.println(peopleSet);

        Set<Student> studentSet = new LinkedHashSet<>();
        studentSet.add(new Student("张三", 18));
        studentSet.add(new Student("李四", 19));
        studentSet.add(new Student("王五", 34));
        studentSet.add(new Student("张三", 12));
        System.out.println(studentSet);



    }
}
