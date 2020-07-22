package 基础语法练习.多线程.多线程开发工具类.Semaphore多线程可同时运行线程管理类;
/*
Semaphore通行证方式管理多线程运行类：
流程：
1.构造方法，带参构造定义可同时运行的线程数量
2.获取通行证
3.执行线程代码
4.归还通行证
* */
public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        for (int i = 0; i < 100; i++) {
            new Thread(mt).start();
        }

    }
}
