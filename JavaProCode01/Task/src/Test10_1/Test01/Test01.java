package Test10_1.Test01;
/*创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。*/
public class Test01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setType(1);
        mt.start();
        System.out.println(mt.getName());
        MyThread mt1 = new MyThread();
        mt1.setType(0);
        mt1.start();
        System.out.println(mt1.getName());
    }
}
