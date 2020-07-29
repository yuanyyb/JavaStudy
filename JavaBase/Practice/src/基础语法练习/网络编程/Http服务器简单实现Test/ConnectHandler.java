package 基础语法练习.网络编程.Http服务器简单实现Test;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
//定义链接控制类用于创建链接
public class ConnectHandler {

    public SocketChannel createConnet(SelectionKey key) {
        try {
            ServerSocketChannel serverSc = (ServerSocketChannel) key.channel();
            SocketChannel sc = serverSc.accept();
            sc.configureBlocking(false);
            sc.register(key.selector(),SelectionKey.OP_READ);
            return sc;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
