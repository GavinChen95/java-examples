package cn.cg.java.algorithm;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/13 9:40
 */


public class SetPractice {



    public static void main(String[] args) {

        // TODO 自动生成的方法存根

        Set<People> set=new LinkedHashSet<>();

        People people1=new People("张三 ", "1");

        People people2=new People("李四 ", "2");

        People people3=new People("王二 ", "3");

        People people4=new People("麻子 ", "4");

        set.add(people1);

        set.add(people2);

        set.add(people3);

        set.add(people4);

        Iterator<People> iterator=set.iterator();

        while (iterator.hasNext()) {

            People people= new People("","");

            people=iterator.next();

            System.out.print("名字是："+people.getName()+"   ");

            System.out.print("id是："+people.getId());

            System.out.println();

        }



    }



}
