package 基础语法练习.网络编程.NIO.选择器练习;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(10000));
        ssc.configureBlocking(false);
        Selector selector = Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);//注册选择器，监视服务端通道的就绪状态
        while(true){
            int count = selector.select();
            if(count>0){
                Set<SelectionKey> skSet = selector.selectedKeys();
                Iterator<SelectionKey> iterator = skSet.iterator();
                while(iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if(key.isAcceptable()){
                        //获取服务端通道
                        ServerSocketChannel keySsc = (ServerSocketChannel) key.channel();
                        //获取延申通道
                        SocketChannel sc = keySsc.accept();
                        sc.configureBlocking(false);
                        sc.register(selector,SelectionKey.OP_READ);
                    }else if(key.isReadable()){
                        SocketChannel readSc = (SocketChannel) key.channel();
                        ByteBuffer bb = ByteBuffer.allocate(1024);
                        int len;
                        while((len =readSc.read(bb))>0){
                            bb.flip();
                            System.out.println("客户端发送的数据："+new String(bb.array(),0,len));
                            bb.clear();
                        }
                        ByteBuffer sendbb = ByteBuffer.wrap("服务端接收数据成功！".getBytes());
                        readSc.write(sendbb);
                        readSc.close();
                    }
                    iterator.remove();
                }
            }
        }

    }
}
