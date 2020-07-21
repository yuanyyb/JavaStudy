package 基础语法练习.多线程.线程池;

import java.util.concurrent.*;

public class Test02 {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10,20,2,TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        tpe.submit(()->{
            System.out.println("1");
        });

    }
}
