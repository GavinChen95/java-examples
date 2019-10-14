package cn.cg.java.algorithm;

/**
 * @author: Gavin
 * @title: 字符串中的数字操作
 * @Package: cn.cg.java.algorithm
 * @date: 2019/10/8 20:31
 */
public class numPlusInString {
    public static void main(String[] args) {
        int num = 0;
        String str = "2sadasda2fdas4" + "1dsa23csd7";
        System.out.print("字符串中的数字有：");
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            //char数组中存储的不止是数字，需要抛出数字格式异常，用continue跳过这些非数字，记录数字
            try {
                int parseInt = Integer.parseInt(charArray[i] + "");
                num += parseInt;
                System.out.print(parseInt + " ");
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println("这些数字之和是" + num);
    }
}
