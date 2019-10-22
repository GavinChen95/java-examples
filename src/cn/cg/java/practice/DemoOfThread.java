package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 15:26
 */
@SuppressWarnings("all")
public class DemoOfThread {
    public static void main(String[] args) {
        //继承Thread类，重写run()方法，直接调用线程对象开启线程
        MyThread myThread = new MyThread();
        myThread.start();

        //实现了Runnable接口，重写run()方法，将线程任务对象传入线程对象，再调用线程对象开启线程
        MyRunnable myRunnable=new MyRunnable();//线程任务对象
        Thread thread=new Thread(myRunnable);//线程对象
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("我在执行main方法" + i);
        }
    }
}

