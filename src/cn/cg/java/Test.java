package cn.cg.java;

/**
 * @author: Gavin
 * @title: 检测return和finally的执行顺序
 * @Package: cn.cg.java
 * @date: 2019/9/22 10:00
 */
public class Test
{public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(test());
}

    static int test()
    {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            ++x;
        }
    }

}




