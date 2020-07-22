package 基础语法练习.多线程.线程池.原子包类.送冰淇凌问题非原子操作;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable{

    private int money=0;//此时使用volatile也无效，用synchronized可以解决
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            money++;
            System.out.println(money);
        }
    }

}
