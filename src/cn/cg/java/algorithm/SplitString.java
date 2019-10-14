package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/9 22:48
 */
public class SplitString {
    //测试输入包含一个测试用例，在一行内给出总长度不超过 80 的字符串。字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用 1 个空格分开，输入保证句子末尾没有多余的空格。

    public static void main(String[] args) {

        String str="Hello World Here I Come";
        String[] split = str.split(" ");
        System.out.println("这句话是由"+split.length+"个单词组成。");

        System.out.print("这句话是：");
        for (String str1:split
             ) {
            System.out.print(str1+" ");
        }

        System.out.println();

        for (int i = 0; i < (split.length)/2; i++) {
            String temp=split[i];
            split[i]=split[split.length-i-1];
            split[split.length-i-1]=temp;
        }

        System.out.print("这句话颠倒输出后是：");
        for (String str2:split
             ) {
            System.out.print(str2+" ");
        }

    }
}
