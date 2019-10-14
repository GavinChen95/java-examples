package cn.cg.java.algorithm;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.characterString
 * @date: 2019/10/11 16:19
 */
@SuppressWarnings("all")
public class Arraylist {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        list.add(2, "王二麻子");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.get(0);
        System.out.println(list.get(0));
        list.set(1, "wo");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.hashCode());
        list.addAll(list);
        for (String list1:list
             ) {
            System.out.print(list1+" ");
        }
        list.clear();
        System.out.println(list.size());
        Collections.addAll(list,"宋兵甲","李世民","杨玉环","李渊","杨广");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
