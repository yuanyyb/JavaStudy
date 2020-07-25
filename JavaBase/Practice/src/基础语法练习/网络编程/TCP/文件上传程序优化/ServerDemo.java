package 基础语法练习.网络编程.TCP.文件上传程序优化;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        ServerSocket ssocket = new ServerSocket(10001);
        while (true) {
            Socket socket = ssocket.accept();
            FileUploadServerThread fust = new FileUploadServerThread(socket);
            tpe.submit(fust);
        }
    }
}
