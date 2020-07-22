package 基础语法练习.多线程.多线程开发工具类.CountDownLatch多线程控制_3个孩子吃饺子案例;

import java.util.concurrent.CountDownLatch;

/*
CountDownLatch应用场景：在一个线程等待另外的多个线程执行完成后唤醒执行
* */
public class Test {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3);//创建一个为3的计数器
        ChildThread1 t1 = new ChildThread1(cdl);
        t1.setName("小明");
        ChildThread2 t2 = new ChildThread2(cdl);
        t2.setName("小红");
        ChildThread3 t3 = new ChildThread3(cdl);
        t3.setName("小刚");
        Mother m = new Mother(cdl);
        m.setName("妈妈");
        t1.start();
        t2.start();
        t3.start();
        m.start();

    }
}
