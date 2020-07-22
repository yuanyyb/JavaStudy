package 基础语法练习.多线程.线程池.volatile练习;
//volatile强制每次重新取共享数据值作为当前线程运算值，同步代码块也会取当前共享数据的最新值
public class Test {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
