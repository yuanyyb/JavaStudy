package 基础语法练习.多线程.线程方法.买票案例Runable_同步静态方法;

public class Ticket1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name == "窗口1") {//同步代码块
            while (true) {
                synchronized (this) {
                    if (ticket <= 0) {
                        break;
                    } else {
                        try {
                            Thread.currentThread().sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "售票，剩余" + ticket + "张");
                    }
                }
            }
        }
        if (name == "窗口2") {//同步方法锁定的是当前this
            while (true) {
                if (synchronizedFun()) {
                    break;
                }
            }
        }
    }

    //同步方法
    private synchronized boolean synchronizedFun() {
        if (ticket <= 0) {
            return true;
        } else {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "售票，剩余" + ticket + "张");
            return false;
        }
    }
}
