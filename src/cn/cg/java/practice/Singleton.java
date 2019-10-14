package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title: 单例模式
 * @Package: cn.cg.java
 * @date: 2019/10/6 16:34
 */
public class Singleton {
    /**
     * 私有化构造方法
     */
    private Singleton(){};

    //调用类中的私有化方法创建一个对象
    private static Singleton instance1=new Singleton();

    //获取唯一的对象
    public  static Singleton getInstance(){
        return instance1;
    };

    void run(){
        System.out.println("我可以跑");
    }

}


