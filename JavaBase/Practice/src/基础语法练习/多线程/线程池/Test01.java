package 基础语法练习.多线程.线程池;


import java.util.concurrent.*;

public class Test01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newFixedThreadPool(10);//线程池中最多10个线程
        es.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        //Thread.sleep(1000);
        es.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });

        /*FutureTask<String> res = (FutureTask) es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"线程正在执行");
            return "线程执行结束结果";
        });
        String reStr = res.get();
        System.out.println(reStr);
        es.shutdown();
        */

        String str = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName()+"\r\ncall方式线程正在执行");
                return "call执行完毕";
            }
        }).get();
        System.out.println(str);
        es.shutdown();

    }
}
