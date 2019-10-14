package cn.cg.java.practice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: Gavin
 * @title:
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 13:18
 */
public class demoOfRegisterException {
    static List<String> strings = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(strings, "张三", "赵六", "王五", "李四");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的用户名：");
        String uname = scanner.next();
        try {
            checkUsername(uname);
            System.out.println("用户注册成功！");
            strings.add(uname);
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        } finally {
            Iterator<String> iterator = strings.iterator();
            System.out.print("当前存在的用户名有：");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }

    }

    static boolean checkUsername(String uname) throws RegisterException {
        for (String name : strings
                ) {
            if (name.equals(uname)) {
                throw new RegisterException("抱歉，注册失败！用户名" + name + "已经被注册过了！");
            }
        }

        return true;
    }
}
