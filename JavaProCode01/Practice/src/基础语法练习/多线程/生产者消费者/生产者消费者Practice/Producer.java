package 基础语法练习.多线程.生产者消费者.生产者消费者Practice;

public class Producer extends Thread{
    private Desk desk;

    public Producer() {
    }

    public Producer(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while(true){
            synchronized(desk.getLocker()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (!desk.isFlag()){
                        System.out.println("生产者生产");
                        desk.setFlag(true);
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
