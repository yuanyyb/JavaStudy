package 基础语法练习.多线程.生产者消费者.生产者消费者简写;
/*



* 消费者：
* 判断桌子有没有
* 没有则等待
* 有则消费，桌子状态置为已消费，消费完通知生产者继续生产，同时共享资源减一
*
*
* 生产者：
* 判断资源是否耗尽，耗尽推出循环，没有则继续执行
* 判断桌子有没有
* 有则等待，且通知消费者消费
* 没有则生产,资源减一
* */
public class ControlDemo {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Customer customer = new Customer();
        cooker.start();
        customer.start();
    }
}
