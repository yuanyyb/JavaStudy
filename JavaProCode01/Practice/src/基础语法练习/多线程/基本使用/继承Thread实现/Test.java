package 基础语法练习.多线程.基本使用.继承Thread实现;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        MyThread mt1 = new MyThread();
        mt1.start();
    }
}
