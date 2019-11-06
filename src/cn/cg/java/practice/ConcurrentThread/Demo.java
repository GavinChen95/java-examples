package cn.cg.java.practice.ConcurrentThread;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/11/4 21:05
 */
public class Demo {
    public static void main(String[] args) {
//等待唤醒案例
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();
    }
}
