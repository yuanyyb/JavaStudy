package 基础语法练习.多线程.生产者消费者.生产者消费者Practice;

public class Customer extends Thread{

    private Desk desk;

    public Customer() {
    }

    public Customer(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("剩余资源："+desk.getCount());
            synchronized(desk.getLocker()) {
                if (desk.getCount() == 0) {
                    break;
                }else{
                    if(desk.isFlag()){
                        System.out.println("消费者正在消费");
                        desk.setFlag(false);
                        desk.setCount(desk.getCount()-1);
                        desk.getLocker().notifyAll();
                    }else{
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
