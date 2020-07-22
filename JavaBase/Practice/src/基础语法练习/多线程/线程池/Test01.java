package 基础语法练习.多线程.线程池;


import java.util.concurrent.*;
//线程池创建和释放基本使用
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
        //runnable方式创建线程
        /*FutureTask<String> res = (FutureTask) es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"线程正在执行");
            return "线程执行结束结果";
        });
        String reStr = res.get();
        System.out.println(reStr);
        es.shutdown();
        */
        //callable方式创建线程
        String str = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName()+"\r\ncall方式线程正在执行");
                return "call执行完毕";
            }
        }).get();
        System.out.println(str);
        es.shutdown();

        //自定义线程池
//        7个参数：
//        1.核心线程数量
//        2.最大线程数量
//        3.空闲线程最大存活时间
//        4.存活时间单位
//        5.任务队列 new ArrayBlockingQueqe&lt;&gt;(10)；//10个任务 线程池最大运行5个 另外5个会放到任务队列中
//        6.创建线程工厂 Executors.defaultThreadFactory();//创建线程池类默认工厂
//        7.任务拒绝策略 new ThreadPoolExecutor.AbortPolicy();
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10,20,2,TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        tpe.submit(()->{
            System.out.println("1");
        });

    }
}
