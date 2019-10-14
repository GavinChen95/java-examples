package cn.cg.java.characterString;

/**
 * @author: Gavin
 * @title: 不同精度的类型转换
 * @Package: cn.cg.java.characterString
 * @date: 2019/10/6 16:07
 */
public class test2 {
    // 精度从小到大：byte-short-char-int-long-float-double
    //              8   16      8  32  64  32      64   bits
    //由高精度去接受低精度的数据时自动进行类型转换；但是低精度去接受高精度的时候会发生精度遗失，这时候需要进行强制类型转换。


    public static void main(String[] args) {
        int a=3;
        float b=3.9999f;
        double b1;
        char c=111;

        int d;
        double e;
        e=a;
        d=(int)b;
        a+=3.12;//特殊处理了将a转换成int 类型,还是原来的a类型


        System.out.println(a);
    }

}
