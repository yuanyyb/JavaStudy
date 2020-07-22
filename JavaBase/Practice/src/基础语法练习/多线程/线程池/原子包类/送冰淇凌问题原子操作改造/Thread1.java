package 基础语法练习.多线程.线程池.原子包类.送冰淇凌问题原子操作改造;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable {
    private AtomicInteger ai = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            ai.getAndIncrement();
            System.out.println(ai.get());
        }
    }
}
