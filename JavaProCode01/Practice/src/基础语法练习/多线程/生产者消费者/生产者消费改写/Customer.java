package 基础语法练习.多线程.生产者消费者.生产者消费改写;

public class Customer extends Thread {
    private Desk desk;
    public Customer(Desk de){
        this.desk = de;
    }
    @Override
    public void run() {
        while(true){
            synchronized(desk.getLocker()){
                System.out.println(desk.getCount());
                if(desk.getCount()==0){
                    break;
                }else {
                    if (desk.isFlag()) {
                        //桌子有
                        System.out.println("消费者正在消费");
                        desk.setFlag(false);
                        desk.getLocker().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    } else {
                        //桌子没有则等待
                        try {
                            desk.getLocker().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
