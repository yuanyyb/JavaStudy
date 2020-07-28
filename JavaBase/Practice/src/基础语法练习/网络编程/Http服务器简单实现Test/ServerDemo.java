package 基础语法练习.网络编程.Http服务器简单实现Test;

import java.io.IOException;
import java.net.InetSocketAddress;

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
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        while(true){
            int count = selector.select();
            if(count>0){
                System.out.println("有客户端连接");
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while(iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if(key.isAcceptable()){
                        ConnetHandler con = new ConnetHandler();
                        con.createConnet(key);
                    }else if(key.isReadable()){
                        HttpRequest hr = new HttpRequest();
                        hr.parse(key);
                        System.out.println("请求数据:"+hr);
                    }
                    iterator.remove();
                }
            }
        }
    }
}
