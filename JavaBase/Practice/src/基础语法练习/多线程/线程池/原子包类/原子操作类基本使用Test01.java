package 基础语法练习.多线程.线程池.原子包类;

import java.util.concurrent.atomic.AtomicInteger;
//volatile能保证每次取最新的共享数据值，但不能当前线程将当前变量赋值给共享数据成功，所以使用原子包中的数据类型
public class 原子操作类基本使用Test01 {
    public static void main(String[] args) {
//        AtomicInteger ac = new AtomicInteger();
        AtomicInteger ac = new AtomicInteger(10);
//        ac.get();//获取最新值   //10
//        ac.getAndIncrement();//获取原子方式增加1前的值   //10
//        ac.incrementAndGet();//获取原子方式增加1后的值   //11
//        ac.addAndGet(10);//获取以原子方式增加指定数字后的值  //20
//        ac.getAndSet(101);//原子方式设置值，并返回旧值
        System.out.println(ac.getAndSet(111)); //
        System.out.println(ac.get());

    }
}
