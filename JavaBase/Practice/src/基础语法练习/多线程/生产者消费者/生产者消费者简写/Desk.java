package 基础语法练习.多线程.生产者消费者.生产者消费者简写;

public class Desk {
    public static boolean flag;
    public static int count=10;
    public static final Object locker = new Object();
}
