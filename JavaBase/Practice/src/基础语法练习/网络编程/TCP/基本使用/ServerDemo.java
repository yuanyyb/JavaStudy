package 基础语法练习.网络编程.TCP.基本使用;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int ch;
        while((ch=is.read())!=-1){
            System.out.print((char)ch);
        }
        is.close();
        serverSocket.close();
    }
}
