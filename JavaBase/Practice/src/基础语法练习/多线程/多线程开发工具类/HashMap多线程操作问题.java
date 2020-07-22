package 基础语法练习.多线程.多线程开发工具类;

import java.util.concurrent.ConcurrentHashMap;

public class HashMap多线程操作问题 {
    public static void main(String[] args) throws InterruptedException {
        //HashMap<String,String> hm = new HashMap<>();//不安全
        //Hashtable<String,String> hm = new Hashtable<>();//安全 但采用悲观锁 效率低
        ConcurrentHashMap<String,String> hm = new ConcurrentHashMap<>(); //安全且效率较高，只锁

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                hm.put(i+"",i+"");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 25; i < 100; i++) {
                hm.put(i+"",i+"");
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(1000);
        /*Set<Map.Entry<String,String>> entries = hm.entrySet();
        entries.stream().forEach(a->{
            System.out.println(a.getKey()+"---"+a.getValue());
        });*/

        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i + ""));//此时在25的地方可能出现null，因为HashMap不是线程安全的可改为使用Hashtable，但性能很低，因为Hashtable使用synchronized悲观锁
        }

    }
}
