package cn.cg.java.practice.ConcurrentThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java
 * @date: 2019/11/4 9:44
 */
public class Demo1 {


    public static void main(String[] args) {
        Goods goods = new Goods();
//        Runnable r1 =new Producer(goods);
//        Runnable r2 = new Consumer(goods);
//        Thread t1=new Thread(r1);
//        Thread t2=new Thread(r2);
//        t1.start();
//        t2.start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable r1 = new Producer(goods);
        Runnable r2 = new Consumer(goods);
        executorService.submit(r1);
        executorService.submit(r2);


    }

}
