package 基础语法练习.多线程.线程方法.买票案例_Lock方式解决;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synchronized (obj) {
            try {
                lock.lock();
                if (ticket <= 0) {
                    break;
                } else {
                    Thread.currentThread().sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"正在售票，当前剩余" + ticket + "张票");
                }
                //lock.unlock();//此语句放到finally
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
//            }


        }
    }
}
