package cn.cg.java.practice.ConcurrentThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java
 * @date: 2019/10/31 16:57
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticket--);
                }
                lock.unlock();
            }
        }
    }

