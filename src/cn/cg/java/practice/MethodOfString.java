package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/11/6 21:22
 */
public class MethodOfString {
    public static void main(String[] args) {
        String s = new String();
        s = "来自中国上海";
        String s1 = "i" + s;
        String s2 = "I来自中国上海";
        System.out.println(s1);

        //比较功能
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //获取功能
        System.out.println(s1.length());
        System.out.println(s2.charAt(2));
        System.out.println(s1.substring(1, 5));

        //转换功能
        char[] chars = s.toCharArray();
        for (char c : chars
                ) {
            System.out.print(c + " ");
        }

        String s3 = s2.replace('I', '我');
        System.out.println(s3);

        //拼接功能
        char[] chars1 = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.print(chars[i]);
            } else {
                System.out.print(chars[i] + "@");
            }

        }
        System.out.println();
        String s0 ="";
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                s0=s0+chars[i];

            }else {
                s0 = s0+chars[i]+" a";
            }
        }

        System.out.println(s0);
        System.out.println(s0.length());

        char[] chars2 = s0.toCharArray();
        int hz=0;
        int kb=0;
        int zm=0;
        for (int i = 0; i <chars2.length ; i++) {
            if (chars2[i]==' '){
                kb++;
            }else if (chars2[i]=='a'){
                zm++;
            }else {
                hz++;
            }
        }
        System.out.println("字符串“"+s0+"”中，含有空白字符"+kb+"个，含有字母"+zm+"个，含有汉字"+hz+"个。");


        String[] s4=s0.split(" ");
        String s5="";
        for (int i = 0; i <s4.length ; i++) {
            s5=s5+s4[i];
        }
        System.out.println(s5);
        System.out.println(s5.length());


    }
}
