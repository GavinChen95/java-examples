package cn.cg.java.characterString;

/**
 * @author: Gavin
 * @title: 字符串比较
 * @Package: cn.cg.java.characterString
 * @date: 2019/9/15 11:37
 */
public class StringCompareEmp{
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
        System.out.println( str.compareTo(objStr.toString()));
    }
}
