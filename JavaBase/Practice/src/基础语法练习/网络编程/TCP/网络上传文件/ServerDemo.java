package 基础语法练习.网络编程.TCP.网络上传文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ssocket = new ServerSocket(10000);
        Socket socket = ssocket.accept();
        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        FileOutputStream fos = new FileOutputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\网络上传文件\\ServerDir\\day14-网络编程01.pdf");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        OutputStream osMsg = socket.getOutputStream();
        osMsg.write("上传文件成功".getBytes());

        osMsg.close();
        bos.close();
        fos.close();
        bis.close();
        is.close();
        socket.close();
        ssocket.close();



    }
}
