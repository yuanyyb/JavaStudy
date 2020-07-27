package 基础语法练习.网络编程.NIO.选择器基本操作;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //打开服务端通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
        //服务端通道绑定端口号
        ssc.bind(new InetSocketAddress(10000));
        //服务端通道配置为非阻塞
        ssc.configureBlocking(false);
        //创建选择器
        Selector selector = Selector.open();
        //服务端通道与选择器绑定,选择器监视服务器通道的就绪状态(OP_ACCEPT)
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        //死循环让选择器监视客户端通道的状态select(),并返回连接的客户端的个数
        while(true){
            int count = selector.select();
            if(count!=0){
                System.out.println("有客户端来连接了");
                //如果有客户端过来连接，则遍历所有的服务端通道(通过令牌获取通道)
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = keys.iterator();
                while(keyIterator.hasNext()){
                    SelectionKey key = keyIterator.next();
                    //如果键的状态是就绪的则获取键对应的服务端通道，并创建对应的延伸通道
                    if(key.isAcceptable()){
                        ServerSocketChannel kssc = (ServerSocketChannel) key.channel();
                        //获取到就绪的服务端通道，并获取到对应的客户端延伸通道，且延伸通道设置为非阻塞
                        SocketChannel yssc =  kssc.accept();
                        yssc.configureBlocking(false);
                        yssc.register(selector,SelectionKey.OP_READ);

                        //此时当客户端来连接时所有步骤已完成
                    }else if(key.isReadable()){//如果令牌是读数据状态，则获取令牌对应的延伸通道
                        SocketChannel sc = (SocketChannel) key.channel();
                        ByteBuffer bb = ByteBuffer.allocate(1024);
                        int len;
                        //读取延伸通道传递过来的缓冲区中数据打印
                        while((len=sc.read(bb))>0){
                            bb.flip();
                            System.out.println(new String(bb.array(),0,len));
                            bb.clear();
                        }
                        //给客户端回写数据
                        sc.write(ByteBuffer.wrap("服务端：已收到信息".getBytes()));
                        sc.close();
                    }
                    keyIterator.remove();//步骤完成后，集合中删除一个已做好绑定的迭代器对象
                }
            }
        }

    }
}
