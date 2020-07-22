package 基础语法练习.多线程.线程池.volatile练习;

public class Thread2 extends Thread {
    @Override
    public void run() {
        //synchronized(Money.lock) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("修改了金额");
            Money.money = 90000;
        //}
    }
}
