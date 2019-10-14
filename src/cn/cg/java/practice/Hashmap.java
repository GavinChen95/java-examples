package cn.cg.java.practice;

import java.util.*;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/13 21:58
 */
public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "胡歌");
        map.put(2, "霍建华");
        map.put(31, "李亚鹏");
        map.put(4, "胡歌");
        map.put(5, "萱萱");

        System.out.println(map);
        System.out.println(map.get(4));//获取键为4的值

        map.remove(5);//删除键为5的键值对
        map.put(3,"刘亦菲");
        System.out.println(map);

        System.out.println("------------------我是一条华丽的分割线------------------");

        //方法一：存储key值到set集合，再遍历map集合
        Set<Integer> set=map.keySet();
        for (Integer s:set
             ) {
            System.out.println(map.get(s));

        }

        System.out.println("------------------我是一条华丽的分割线------------------");

        //方法二：使用Entry键值对对象遍历map
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for (Map.Entry<Integer,String> entry:entrySet
             ) {
            System.out.println("键是"+entry.getKey()+",值是"+entry.getValue());
        }


    }
}
