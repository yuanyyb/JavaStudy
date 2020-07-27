package 基础语法练习.网络编程.TCP.优化后的上传文件案例Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5,10,2, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        while(true){
            Socket so = ss.accept();
            tpe.submit(new FileUploadThread(so));
        }

    }
}
