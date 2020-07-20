package 基础语法练习.多线程.线程的状态;
/*NEW RUNNABLE BLOCKED RUNNABLE TEMINATED*/
public class Test003 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(()->{
            synchronized(lock){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getState());
            synchronized(lock){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getState());
            }
        });
        System.out.println(t1.getState());
        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        System.out.println(t2.getState());
        Thread.sleep(2000);
        System.out.println(t2.getState());
    }
}
