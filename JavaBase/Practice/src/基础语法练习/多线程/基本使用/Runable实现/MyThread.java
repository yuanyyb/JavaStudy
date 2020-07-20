package 基础语法练习.多线程.基本使用.Runable实现;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(" "+i);
        }
        System.out.println("打印结束");
    }
}
