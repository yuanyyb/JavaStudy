package 基础语法练习.多线程.基本使用.Runable实现;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread tr = new Thread(mt);
        tr.start();

        Thread tr2 = new Thread(mt);
        tr2.start();
    }
}
