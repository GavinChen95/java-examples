package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 控制台打印菱形 * 1-3-5-7-5-3-1
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/7 17:58
 */
public class rhombus {
    public static void main(String[] args) {
        //菱形上大半部分
        for (int i = 0; i < 4; i++) {
            //上半部分左空白
            for (int j = 4; j > i + 1; j--) {
                System.out.print(" ");
            }
            //上半部分*
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //上半部分右空白
            System.out.println(" ");

        }

        //菱形下小半部分
        for (int i = 0; i <3 ; i++) {
            //左下半部分空白
            for (int j = 0; j <i+1; j++) {
                System.out.print(" ");
            }
            //下半部分*
            for (int j = 0; j < 5-2*i; j++) {
                System.out.print("*");
            }
            //右下半部分空白
            System.out.println(" ");
        }

    }

}
