package 基础语法练习.网络编程.NIO.选择器练习;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel sc = SocketChannel.open();
        ByteBuffer bb = ByteBuffer.wrap("你好".getBytes());
        sc.connect(new InetSocketAddress("127.0.0.1",10000));
        sc.write(bb);
        ByteBuffer receivebb = ByteBuffer.allocate(1024);
        int len;
        while((len = sc.read(receivebb))>0){
            receivebb.flip();
            System.out.println("服务回传的数据："+new String(receivebb.array(),0,len));
            receivebb.clear();
        }
        sc.close();
    }
}
