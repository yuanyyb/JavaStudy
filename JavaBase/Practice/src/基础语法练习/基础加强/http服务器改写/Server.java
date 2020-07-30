package 基础语法练习.基础加强.http服务器改写;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Server {
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
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while(iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if(key.isAcceptable()){
                        ConnectHandler ch = new ConnectHandler();
                        ch.createConnect(key);
                    }else if(key.isReadable()){
                        //获取请求内容
                        HttpRequest request = new HttpRequest(key);
                        request.parse();
                        System.out.println("发送的请求内容：---->"+request);
                        if(request.getRequestURI()==null||"".equals(request.getRequestURI())){
                            key.channel();
                            continue;
                        }
                        //向客户端发送响应数据
                        System.out.println("开始向客户端发送数据：------>");
                        HttpResponse response = new HttpResponse(key);
                        response.setHttpRequest(request);
                        response.sendStaticData();
                    }
                    iterator.remove();
                }
            }
        }
    }
}
