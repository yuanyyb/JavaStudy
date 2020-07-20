package 基础语法练习.多线程.线程的状态;

import java.util.concurrent.locks.ReentrantLock;

/*
NEW RUNNABLE BLOCKED RUNNABLE TEMINATED
* */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(obj) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        Thread t2 = new Thread(() -> {
            System.out.println("当前线程正在运行：" + Thread.currentThread().getState());
            synchronized(obj) {
                System.out.println("获取到锁时的状态：" + Thread.currentThread().getState());
            }
        });
        System.out.println("线程创建的状态"+t2.getState()); //NEW
        t2.start();
        Thread.sleep(1000);

        System.out.println("获取不到锁时的状态："+t2.getState());
        Thread.sleep(11000);
        System.out.println("结束的状态："+t2.getState());

    }
}
