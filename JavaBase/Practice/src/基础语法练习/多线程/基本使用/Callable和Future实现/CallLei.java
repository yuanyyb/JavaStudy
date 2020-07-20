package 基础语法练习.多线程.基本使用.Callable和Future实现;

import java.util.concurrent.Callable;

public class CallLei implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.print(" "+i);
            if(i%100==0){
                System.out.println();
            }
        }
        return "循环结束";//call接口返回线程执行完成的结果
    }
}
