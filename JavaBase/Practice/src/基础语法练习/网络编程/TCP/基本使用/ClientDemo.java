package 基础语法练习.网络编程.TCP.基本使用;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);
        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());
        os.close();
        socket.close();
    }
}
