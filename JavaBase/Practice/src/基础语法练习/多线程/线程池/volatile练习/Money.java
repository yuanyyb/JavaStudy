package 基础语法练习.多线程.线程池.volatile练习;

public class Money {
    public static volatile int money=100000;
    //public static int money=100000;
    public static Object lock = new Object();
}
