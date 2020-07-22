package 基础语法练习.多线程.多线程开发工具类.CountDownLatch多线程控制_3个孩子吃饺子案例;

import java.util.concurrent.CountDownLatch;

public class ChildThread1 extends Thread {
    private CountDownLatch cdl;
    public ChildThread1(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在吃饺子，吃了"+(i+1)+"个");
        }
        cdl.countDown();//将计数器-1
    }
}
