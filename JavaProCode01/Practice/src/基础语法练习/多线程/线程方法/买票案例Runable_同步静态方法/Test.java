package 基础语法练习.多线程.线程方法.买票案例Runable_同步静态方法;

public class Test {
    public static void main(String[] args) {
        //Ticket1 t1 = new Ticket1();//同步方法锁this
        Ticket2 t1 = new Ticket2();//同步静态方法锁字节码.class对象

        Thread tr1 = new Thread(t1);
        Thread tr2 = new Thread(t1);
        tr1.setName("窗口1");
        tr2.setName("窗口2");
        tr1.start();
        tr2.start();
    }
}
