package 基础语法练习.网络编程.TCP.网络上传文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\网络上传文件\\ClientDir\\day14-网络编程01.pdf"));
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int msgLen;
        char[] chars = new char[1024];
        while((msgLen = isr.read(chars))!=-1) {
            System.out.println(new String(chars,0,msgLen));
        }
        isr.close();
        is.close();
        //bos.close();
        os.close();
        bis.close();
        socket.close();
    }
}
