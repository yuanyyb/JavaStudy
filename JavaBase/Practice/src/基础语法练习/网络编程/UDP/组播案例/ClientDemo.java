package 基础语法练习.网络编程.UDP.组播案例;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getByName("224.0.1.0");//指定组播地址
        byte[] bytes = "你好".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ia,10000);
        ds.send(dp);
        ds.close();
    }
}
