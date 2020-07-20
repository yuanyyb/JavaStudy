package 基础语法练习.多线程.线程的状态;
/*要求打印线程按照NEW RUNNABLE TIMED_WAITING RUNNABLE TERMINATED*/
public class Test001 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getState());
        });
        System.out.println(t.getState()); //new
        t.start();
        Thread.sleep(100);
        System.out.println(t.getState());
        Thread.sleep(2000);
        System.out.println(t.getState());

    }
}
