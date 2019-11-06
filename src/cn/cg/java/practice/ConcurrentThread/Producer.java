package cn.cg.java.practice.ConcurrentThread;

import cn.cg.java.practice.ConcurrentThread.Goods;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/11/4 9:30
 */
public class Producer implements Runnable {
    Goods g;

    public Producer(Goods g) {
        this.g = g;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (g) {
                if (!g.b) {
                    System.out.println("生产了商品");
                    g.b = true;
                    g.notify();
                } else {
                    try {
                        g.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        }
    }
}
