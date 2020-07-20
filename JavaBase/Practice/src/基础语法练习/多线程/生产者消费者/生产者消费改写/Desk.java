package 基础语法练习.多线程.生产者消费者.生产者消费改写;

public class Desk {
    private boolean flag;
    private int count;
    private final Object locker = new Object();

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public Desk() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLocker() {
        return locker;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", locker=" + locker +
                '}';
    }
}
