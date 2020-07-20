package 基础语法练习.多线程.线程的状态;
//按照状态执行：NEW RUNNABLE WAITING RUNNABLE TERMINATED
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Object obj =new Object();
        Thread thread1 = new Thread(()->{
            System.out.println("线程就绪状态："+Thread.currentThread().getState());
            synchronized(obj){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程就绪状态："+Thread.currentThread().getState());
            }
        });
        System.out.println("线程对象新创建时的状态："+thread1.getState());
        thread1.start();
        Thread.sleep(200);
        System.out.println("线程对象进入wait方法时的状态："+thread1.getState());
        new Thread(()->{
            synchronized(obj){
                obj.notifyAll();
            }
        }).start();
        Thread.sleep(200);
        System.out.println("线程结束时的状态："+thread1.getState());
    }
}
