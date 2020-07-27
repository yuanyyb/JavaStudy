package 基础语法练习.网络编程.NIO.通道基本操作;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

//        1).打开通道：
        SocketChannel sc = SocketChannel.open();
//        2).指定ip和端口号：
        sc.connect(new InetSocketAddress("127.0.0.1",10002));
//        3).写出缓冲区数据：
        ByteBuffer bData = ByteBuffer.wrap("你好".getBytes());
        sc.write(bData);
//        4).释放资源
        sc.close();

    }
}
