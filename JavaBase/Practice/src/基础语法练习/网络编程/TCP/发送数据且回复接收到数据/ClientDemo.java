package 基础语法练习.网络编程.TCP.发送数据且回复接收到数据;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //向服务端发送数据
        Socket outSocket = new Socket("127.0.0.1",10000);
        OutputStream os = outSocket.getOutputStream();
        byte[] data = "发送数据了".getBytes();
        os.write(data,0,data.length);
        outSocket.shutdownOutput();
        InputStream is = outSocket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is,Charset.forName("UTF-8"));
        char[] chs = new char[1024];
        int len;
        while((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
        is.close();
        os.close();
        outSocket.close();
        //接收服务端回复的数据
        /*ServerSocket getSocket = new ServerSocket(10000);
        Socket inSocket = getSocket.accept();
        InputStream is = inSocket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
        char[] chs = new char[1024];
        int len;
        while((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        getSocket.close();
        is.close();
        isr.close();*/


    }
}
