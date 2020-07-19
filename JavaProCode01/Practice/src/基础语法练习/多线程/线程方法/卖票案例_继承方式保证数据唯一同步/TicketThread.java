package 基础语法练习.多线程.线程方法.卖票案例_继承方式保证数据唯一同步;

public class TicketThread extends Thread {
    //private int ticket=100;此时两个线程分别使用自己的ticket,所以重复,
    private static int ticket = 100;//此线程类创建的所有对象中的ticket值公用同步
    private static Object obj = new Object();//锁的对象也必须保持多个线程一致，所以用static修饰
    @Override
    public void run() {
        while(true){
            //synchronized(this){//此时this表示当前线程，多个线程this就会不一致，还是会有安全问题，所以改用static obj方式
            synchronized(obj){
                if(ticket<=0){
                    break;
                }else{
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"当前剩余票数"+ticket+"张");
                }
            }
        }
    }
}
