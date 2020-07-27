package 基础语法练习.网络编程.NIO.选择器基本操作;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel sc = SocketChannel.open();
        sc.connect(new InetSocketAddress("127.0.0.1",10000));
        ByteBuffer sendbb = ByteBuffer.wrap("你好".getBytes());
        sc.write(sendbb);

        ByteBuffer receivebb = ByteBuffer.allocate(1024);
        int len;
        while((len = sc.read(receivebb))!=-1){
            System.out.println(new String(receivebb.array(),0,len));
        }


        sc.close();
    }
}
