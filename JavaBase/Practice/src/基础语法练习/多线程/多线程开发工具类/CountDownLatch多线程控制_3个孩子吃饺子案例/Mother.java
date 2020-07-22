package 基础语法练习.多线程.多线程开发工具类.CountDownLatch多线程控制_3个孩子吃饺子案例;

import java.util.concurrent.CountDownLatch;

public class Mother extends Thread{
    private CountDownLatch cdl;
    public Mother(CountDownLatch cdl) {
        this.cdl = cdl;
    }
    @Override
    public void run() {
        try {
            cdl.await();//当计数器为0时会唤醒此线程执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("饺子吃完，"+Thread.currentThread().getName()+"洗碗");
    }
}
