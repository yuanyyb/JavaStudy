package 基础语法练习.多线程.基本使用.继承Thread实现;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(" "+i);
        }
        System.out.println("打印结束");
    }
}
