package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 17:46
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("我是实现Runnable接口的线程"+i);
        }
    }
}
