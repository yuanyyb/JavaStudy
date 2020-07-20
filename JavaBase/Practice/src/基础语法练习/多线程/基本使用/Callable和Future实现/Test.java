package 基础语法练习.多线程.基本使用.Callable和Future实现;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallLei cl = new CallLei();
        FutureTask<String> ft = new FutureTask<>(cl);
        Thread tr = new Thread(ft);//构造方法需要一个实现Runable接口的实现类,可用FutureTask将自定义线程类包装起来使用
        tr.start();
        //此处用get方法获取call方法在线程执行完的时候的返回值:此处必须start之后
        // 调用，start之前调用会让程序一直死等状态
        String res = ft.get();
        System.out.println();
        System.out.println(res);
        FutureTask<String> ft1 = new FutureTask<>(cl);
        Thread tr1 = new Thread(ft1);
        tr1.start();
        String res1 =ft1.get();
        System.out.println();
        System.out.println(res1);
    }
}
