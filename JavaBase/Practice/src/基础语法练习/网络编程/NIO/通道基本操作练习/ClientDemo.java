package 基础语法练习.网络编程.NIO.通道基本操作练习;

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
        //sc.shutdownOutput(); 往服务端写入结束标记
        ByteBuffer receivebb = ByteBuffer.allocate(1024);
        int len;
        while((len=sc.read(receivebb))!=-1){
            receivebb.flip();
            System.out.println("接收到服务端回传数据："+new String(receivebb.array(),0,len));
            receivebb.clear();
        }
        sc.close();
    }
}
