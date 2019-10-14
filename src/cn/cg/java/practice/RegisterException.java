package cn.cg.java.practice;

/**
 * @author: Gavin
 * @title: 自定义一个异常，为注册异常，如果用户名已存在，则抛出RegisterException
 * @Package: cn.cg.java.practice
 * @date: 2019/10/14 13:16
 */
public class RegisterException extends Exception {
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
