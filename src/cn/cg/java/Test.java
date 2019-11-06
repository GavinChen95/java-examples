package cn.cg.java;

/**
 * @author: Gavin
 * @title: just for my test
 * @Package: cn.cg.java
 * @date: 2019/9/22 10:00
 */
public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket,"甲");
        Thread t2 = new Thread(ticket,"乙");
        Thread t3 = new Thread(ticket,"丙");

        t1.start();
        t2.start();
        t3.start();


    }

}





