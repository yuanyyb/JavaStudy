package 基础语法练习.网络编程.TCP.发送数据且回复接收到数据;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket sgetSocket = ss.accept();
        InputStream is = sgetSocket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
        char[] chs = new char[1024];
        int len;
        //因为客户端没有close，所以此处收不到结束标志，read方法阻塞，客户端调用shutdownOutput();断开输出流并发送结束标识;
        while((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

        OutputStream os = sgetSocket.getOutputStream();
        byte[] data = "发送过来的数据接收到了".getBytes();
        os.write(data,0,data.length);

        os.close();
        isr.close();
        is.close();
        sgetSocket.close();
        ss.close();

//        isr.close();
//        is.close();
//        ss.close();
//        sgetSocket.close();

        /*Socket sendSocket = new Socket("127.0.0.1",10001);
        OutputStream os = sendSocket.getOutputStream();
        os.write("服务器收到信息".getBytes());
        os.close();
        sendSocket.close();*/

    }
}
