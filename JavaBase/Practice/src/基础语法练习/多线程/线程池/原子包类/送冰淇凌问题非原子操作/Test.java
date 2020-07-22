package 基础语法练习.多线程.线程池.原子包类.送冰淇凌问题非原子操作;

import 基础语法练习.多线程.线程池.原子包类.送冰淇凌问题非原子操作.Thread1;

public class Test {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        for (int i = 0; i < 100; i++) {
            new Thread(t1).start();
        }

    }
}
