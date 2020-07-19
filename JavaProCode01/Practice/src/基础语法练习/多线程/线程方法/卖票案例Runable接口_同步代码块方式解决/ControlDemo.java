package 基础语法练习.多线程.线程方法.卖票案例Runable接口_同步代码块方式解决;

public class ControlDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread tr1 = new Thread(t);
        tr1.start();
        Thread tr2 = new Thread(t);
        tr2.start();
        Thread tr3 = new Thread(t);
        tr3.start();

    }
}
