package 基础语法练习.网络编程.NIO.通道基本操作练习;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;


//客户端向服务端发送数据，服务端收到数据并回传，客户端接收数据打印
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(10000));
        ssc.configureBlocking(false);
        while(true){
            SocketChannel sc = ssc.accept();//获取延伸通道
            if(sc!=null){
                sc.configureBlocking(false);//设置延伸通道非阻塞
                ByteBuffer receivebb = ByteBuffer.allocate(1024);
                int len;
                //while((len = sc.read(receivebb))!=-1){
                while((len = sc.read(receivebb))>0){//此处读到数据就打印，0或-1都直接回传客户端消息
                    receivebb.flip();
                    System.out.println("接收到的客户端发送的数据："+new String(receivebb.array(),0,len));
                    receivebb.clear();
                };
                ByteBuffer sendbb = ByteBuffer.wrap("服务端已收到".getBytes());
                sc.write(sendbb);
                sc.close();
            }
        }
    }
}
