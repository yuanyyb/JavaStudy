package 基础语法练习.多线程.线程方法.卖票案例_问题代码;

public class ControlDemo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Thread tr1 = new Thread(t1);
        tr1.start();
        Thread tr2 = new Thread(t1);
        tr2.start();
        Thread tr3 = new Thread(t1);
        tr3.start();
    }
    //此时会出现相同票数，且会出现负数
}
