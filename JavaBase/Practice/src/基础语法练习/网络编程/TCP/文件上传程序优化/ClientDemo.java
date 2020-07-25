package 基础语法练习.网络编程.TCP.文件上传程序优化;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10001);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\网络上传文件\\ClientDir\\day14-网络编程01.pdf"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();//此处释放了输出流，且发送出结束标志
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int msgLen;
        char[] chars = new char[1024];
        while((msgLen = br.read(chars))!=-1) {
            System.out.println(new String(chars,0,msgLen));
        }
        br.close();
        //bos.close();
        bis.close();
        socket.close();
    }
}
