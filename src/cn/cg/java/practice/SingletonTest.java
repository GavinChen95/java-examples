package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title: 单例模式的使用
 * @Package: cn.cg.java.characterString
 * @date: 2019/10/6 16:49
 */
public class SingletonTest {
    public static void main(String[] args) {
        short a1=3;
        int a=3;
        float c=3.1f;
        float c1=3.1f;
        double b=3.1;

        System.out.println(b-c);


        System.out.println(a);

        Singleton instance2 = Singleton.getInstance();
        instance2.run();
    }

}
