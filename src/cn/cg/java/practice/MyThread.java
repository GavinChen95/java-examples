package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 15:27
 */
public class MyThread extends Thread {
    public MyThread() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在执行新线程的方法" + i);
        }
    }


}

