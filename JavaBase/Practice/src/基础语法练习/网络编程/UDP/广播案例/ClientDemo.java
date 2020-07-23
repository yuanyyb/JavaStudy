package 基础语法练习.网络编程.UDP.广播案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();//创建发送数据对象（码头）
        String s = "hello 大家好！我是渣渣辉！！";
        byte[] bytes = s.getBytes();
        InetAddress ia = InetAddress.getByName("255.255.255.255");//广播只要是此地址就会被所有接收端收到
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ia, port);//将发送数据，地址，端口号等信息打包
        ds.send(dp);//调用发送方法
        ds.close();//释放资源
    }
}
