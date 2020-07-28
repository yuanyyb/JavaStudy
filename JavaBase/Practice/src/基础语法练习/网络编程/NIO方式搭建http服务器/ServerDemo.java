package 基础语法练习.网络编程.NIO方式搭建http服务器;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(10000));
        ssc.configureBlocking(false);
        Selector selector = Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        while(true){
            int count = selector.select();
            if(count>0){
                System.out.println("有客户端来连接");
                Set<SelectionKey> keySet = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keySet.iterator();
                while(iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if(key.isAcceptable()){
                        ConnectHandler ch = new ConnectHandler();
                        ch.createConnet(key);
                    }else if(key.isReadable()){
                        HttpRequest request = new HttpRequest();
                        request.parse(key);
                        System.out.println("请求的数据为--->"+request);
                        if(request.getRequestURI()==null||"".equals(request.getRequestURI())){
                            key.channel();
                            continue;
                        }
                        System.out.println("数据解析完毕，准备响应数据");
                        //响应数据
                        HttpResponse response = new HttpResponse();
                        response.setHttpRequest(request);
                        response.sendStaticResouce(key);
                    }
                    iterator.remove();
                }
            }
        }
    }
}
