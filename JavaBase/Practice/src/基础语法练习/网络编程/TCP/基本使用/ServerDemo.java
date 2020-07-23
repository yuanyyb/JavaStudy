package 基础语法练习.网络编程.TCP.基本使用;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));//使用转换流读取汉字
        char[] chs = new char[1024];
        int len;
        while((len=isr.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        /*int ch;
        while((ch=is.read())!=-1){
            System.out.print((char)ch);
        }*/
        is.close();
        isr.close();
        serverSocket.close();
    }
}
