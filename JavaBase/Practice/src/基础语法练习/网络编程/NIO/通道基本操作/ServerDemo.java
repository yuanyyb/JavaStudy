package 基础语法练习.网络编程.NIO.通道基本操作;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        1)打开一个服务端通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
//        2)绑定对应IP和端口号
        ssc.bind(new InetSocketAddress(10002));
//       3)设置通道是否阻塞, 默认阻塞
        ssc.configureBlocking(false);
//        4)没有门卫所以需要while(true) 不断接收
        while(true){
//        5)有客户端连接相当于创建了一个类似客户端连接通道的对象用于传递数据
            SocketChannel sc = ssc.accept();
//        6)客户端缓冲区的数据就传递到延伸通道里
            if(sc!=null) {
                ByteBuffer bb = ByteBuffer.allocate(1024);
                int len;
                if ((len = sc.read(bb)) != -1) {
                    System.out.println(new String(bb.array(),0,len));
                }
                sc.close();
            }

        }

//        如果有客户端连接会返回socketchannel对象，没连接则返回null
//        6)客户端缓冲区的数据就传递到延伸通道里
//        7)将数据放到缓冲区
        //返回值：正数:读取的有效字节个数；0：没有读到有效字节；-1：读到结束标记


    }
}
