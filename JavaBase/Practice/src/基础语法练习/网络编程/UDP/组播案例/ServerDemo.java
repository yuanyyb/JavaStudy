package 基础语法练习.网络编程.UDP.组播案例;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        InetAddress ia = InetAddress.getByName("224.0.1.0");//加入组播地址，此处组播地址与客户端必须相同
        ms.joinGroup(ia);//此方法
        ms.receive(dp);
        byte[] data = dp.getData();
        System.out.println(new String(data));
        ms.close();
    }
}
