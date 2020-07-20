package 基础语法练习.多线程.线程方法.卖票案例_问题代码;

public class Ticket implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while(true){
            if(ticket<=0){
                break;
            }else{
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                System.out.println("当前剩余"+ticket+"张票");
            }
        }
    }
}
