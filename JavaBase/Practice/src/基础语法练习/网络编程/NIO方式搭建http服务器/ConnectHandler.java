package 基础语法练习.网络编程.NIO方式搭建http服务器;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ConnectHandler {
    public SocketChannel createConnet(SelectionKey key){
        try {
            ServerSocketChannel keySsc = (ServerSocketChannel) key.channel();
            SocketChannel ysSc = keySsc.accept();
            ysSc.configureBlocking(false);
            ysSc.register(key.selector(), SelectionKey.OP_READ);
            return ysSc;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
