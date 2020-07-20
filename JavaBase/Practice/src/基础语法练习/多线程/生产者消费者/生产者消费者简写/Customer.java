package 基础语法练习.多线程.生产者消费者.生产者消费者简写;

public class Customer extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized(Desk.locker){
                if(Desk.count==0){
                    break;
                }else {
                    if (Desk.flag) {
                        //桌子有
                        System.out.println("消费者正在消费");
                        Desk.flag = false;
                        Desk.locker.notifyAll();
                        Desk.count--;
                    } else {
                        //桌子没有则等待
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
