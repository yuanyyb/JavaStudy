package 基础语法练习.多线程.生产者消费改写;

public class Cooker extends Thread {
    private Desk desk;
    public Cooker(Desk de){
        this.desk = de;
    }
    @Override
    public void run() {
        while(true){
            synchronized(desk.getLocker()){
                System.out.println(desk.getCount());
                if(desk.getCount()==0) {
                    break;
                }else{
                    if (!desk.isFlag()) {
                        System.out.println("生产者正在生产");
                        desk.setFlag(true);
                        desk.getLocker().notifyAll();
                    } else {
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
