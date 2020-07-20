package 基础语法练习.多线程.线程的状态;

import javax.swing.*;

/*按照状态执行：NEW RUNNABLE WAITING RUNNABLE TERMINATED*/
public class Test002 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread(()->{
            synchronized(obj) {
                System.out.println(Thread.currentThread().getState());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getState());
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (obj) {
                obj.notifyAll();
            }
        });
        System.out.println(t1.getState());
        t1.start();
        Thread.sleep(200);
        System.out.println(t1.getState());
        t2.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
