package 基础语法练习.多线程.多线程开发工具类.Semaphore多线程可同时运行线程管理类;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {
    private Semaphore semaphore = new Semaphore(2);//定义最多允许执行的线程数量
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("获得通行证");
            Thread.sleep(2000);
            System.out.println("执行完毕，释放通行证");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
