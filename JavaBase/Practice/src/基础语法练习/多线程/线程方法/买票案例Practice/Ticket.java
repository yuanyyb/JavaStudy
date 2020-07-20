package 基础语法练习.多线程.线程方法.买票案例Practice;

public class Ticket extends Thread {
    private static int count=100;
    private static final Object locker=new Object();
    @Override
    public void run() {
        while(true){
            synchronized(locker) {
                if(count==0) {
                    break;
                }else{
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "正在售票，剩余" + count + "票");
                }
            }
        }
    }
}
