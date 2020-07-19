package 基础语法练习.多线程.线程方法.卖票案例Runable接口_同步代码块方式解决;

public class Ticket implements Runnable{
    private int ticket=100;
    private Object obj = new Object();


    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                } else {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println("当前剩余" + ticket + "张票");
                }
            }

        }
    }
}
