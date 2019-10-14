package cn.cg.java.characterString;

/**
 * @author: Gavin
 * @title: 查找字符串最后出现的位置
 * @Package: cn.cg.java.characterString
 * @date: 2019/9/15 11:38
 */
public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串 Runoob");
        }else{
            System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
        }
    }
}