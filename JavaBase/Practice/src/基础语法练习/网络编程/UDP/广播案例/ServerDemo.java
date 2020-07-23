package 基础语法练习.网络编程.UDP.广播案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//广播的接收端与单播接收端完全一样
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        byte[] res = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(res, 0, len));
        ds.close();
    }
}
