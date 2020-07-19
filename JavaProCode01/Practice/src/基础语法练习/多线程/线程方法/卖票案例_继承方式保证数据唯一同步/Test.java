package 基础语法练习.多线程.线程方法.卖票案例_继承方式保证数据唯一同步;

public class Test {
    public static void main(String[] args) {
        TicketThread t1 =new TicketThread();
        TicketThread t2 =new TicketThread();
        t1.setName("窗口1");
        t1.start();
        t2.setName("窗口2");
        t2.start();
    }
}
