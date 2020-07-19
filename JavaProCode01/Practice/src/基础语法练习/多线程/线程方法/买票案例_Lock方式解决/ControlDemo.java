package 基础语法练习.多线程.线程方法.买票案例_Lock方式解决;

public class ControlDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread tr1 = new Thread(t);
        tr1.setName("窗口1");
        tr1.start();
        Thread tr2 = new Thread(t);
        tr2.setName("窗口2");
        tr2.start();
        Thread tr3 = new Thread(t);
        tr3.setName("窗口3");
        tr3.start();

    }
}
