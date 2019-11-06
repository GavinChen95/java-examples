package cn.cg.java.practice.ConcurrentThread;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/11/4 21:04
 */
public class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(String name,BaoZi bz){
        super(name);
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag == false){//没包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pier+bz.xianer+"包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
