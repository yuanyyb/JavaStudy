package 基础语法练习.多线程.线程池.volatile练习;

public class Thread1 extends Thread{
    @Override
    public void run() {
        while (true) {
            //synchronized (Money.lock) {
                if(Money.money != 100000) {
                    System.out.println("钱已经不是十万了");
                    break;
                }
            //}
        }
    }
}
