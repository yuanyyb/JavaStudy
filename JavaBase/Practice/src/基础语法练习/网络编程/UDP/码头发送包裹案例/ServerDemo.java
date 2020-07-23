package 基础语法练习.网络编程.UDP.码头发送包裹案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);//在10000端口开启程序接收数据
        byte[] bytes = new byte[1024];//定义一个字节数据用于接收数据
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);//创建一个包接收数据
        ds.receive(dp);//开启等待接收数据，将接收的数据放到之前定义的包中
        byte[] res = dp.getData();//调用包的getData方法获取接收到的数据
        int len = dp.getLength();//获取接收到的数据字节数
        System.out.println(new String(res, 0, len));
        ds.close();//释放资源
    }
}
