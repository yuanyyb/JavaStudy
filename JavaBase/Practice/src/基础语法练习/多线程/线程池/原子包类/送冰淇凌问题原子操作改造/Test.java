package 基础语法练习.多线程.线程池.原子包类.送冰淇凌问题原子操作改造;

public class Test {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        for (int i = 0; i < 100; i++) {
            new Thread(t1).start();
        }
    }
}
