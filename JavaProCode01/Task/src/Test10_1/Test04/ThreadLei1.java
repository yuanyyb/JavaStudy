package Test10_1.Test04;

public class ThreadLei1 extends Thread {
    //是否偶数
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(this.type==1){
                if(i%2==0){
                    System.out.print(" "+i);
                }
            }else{
                if(i%2==1){
                    System.out.print(" "+i);
                }
            }
            if(i%100==0){
                System.out.println();
            }
        }
        System.out.println("打印完成");
    }
}
