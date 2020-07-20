package 基础语法练习.多线程.生产者消费者Practice;

public class Desk {
    private int count;
    //是否有食物
    private boolean flag;
    private final Object locker = new Object();

    public Desk() {
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getLocker() {
        return locker;
    }
}
