package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 9*9口诀表
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/7 17:21
 */
public class multiply9 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();

        }
    }
}
