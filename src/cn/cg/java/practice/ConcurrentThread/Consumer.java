package cn.cg.java.practice.ConcurrentThread;

/**
 * @author: Gavin
 * @title: 消费者线程任务
 * @Package: cn.cg.java.practice
 * @date: 2019/11/4 9:30
 */
public class Consumer implements Runnable {
    Goods g;

    public Consumer(Goods g) {
        this.g = g;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (g) {
                if (!g.b) {
                    System.out.println("商品卖完了");
                    try {
                        g.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("商品被卖了");
                    g.b = false;
                    g.notify();
                }
            }
        }

    }
}
