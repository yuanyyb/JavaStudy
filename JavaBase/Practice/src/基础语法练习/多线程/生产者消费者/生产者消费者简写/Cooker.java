package 基础语法练习.多线程.生产者消费者.生产者消费者简写;

public class Cooker extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized(Desk.locker){
                System.out.println(Desk.count);
                if(Desk.count==0) {
                    break;
                }else{
                    if (!Desk.flag) {
                        System.out.println("生产者正在生产");
                        Desk.flag = true;
                        Desk.locker.notifyAll();
                    } else {
                        try {
                            Desk.locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
