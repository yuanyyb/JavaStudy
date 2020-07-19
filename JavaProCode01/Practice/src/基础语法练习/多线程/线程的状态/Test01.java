package 基础语法练习.多线程.线程的状态;

/*
新建(NEW)    new之后
就绪(RUNNABLE)   start()之后
阻塞(BLOCKED)  未获取到锁对象时
等待(WAITING)  锁.wait()方法后
计时等待(TIMED_WAITING)  Thread.sleep(100)方法时
结束(TERMINATED)  线程执行完时*/

/*Test1:要求打印线程按照NEW RUNNABLE TIMED_WAITING RUNNABLE TERMINATED*/
public class Test01 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("执行start之后线程的状态："+Thread.currentThread().getState());//RUNNABLE
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程中代码执行完毕的状态："+Thread.currentThread().getState()); //RUNNABLE
        });
        System.out.println("线程在新创建后的初始状态:" + thread.getState()); //NEW
        thread.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程在sleep时的状态："+thread.getState()); //TIMED_WAITING
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程在执行结束时的状态："+thread.getState()); //TERMINATED

    }
}
