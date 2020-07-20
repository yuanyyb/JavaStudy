package 基础语法练习.多线程.生产者消费者.生产者消费者Practice;

public class Controller {
    public static void main(String[] args) {
        Desk desk = new Desk();
        desk.setCount(10);
        desk.setFlag(false);
        Customer cu = new Customer(desk);
        Producer pr = new Producer(desk);
        cu.start();
        pr.start();
    }
}
