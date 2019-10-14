package cn.cg.java.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/12 10:07
 */
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);

        linkedList.addFirst(0);
        linkedList.addLast(5);
        System.out.println(linkedList);

        if (!linkedList.isEmpty()){
            System.out.println(linkedList.pop());
        }

        linkedList.push(111);

        System.out.println(linkedList);
        Object clone = linkedList.clone();
        System.out.println(clone);


        Iterator<Integer> iterator=linkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
