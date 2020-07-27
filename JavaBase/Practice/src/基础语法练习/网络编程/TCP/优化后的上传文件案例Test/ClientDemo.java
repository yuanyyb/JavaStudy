package 基础语法练习.网络编程.TCP.优化后的上传文件案例Test;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("127.0.0.1",10000);
        //创建缓存流读文件
        BufferedInputStream bis=null;
        BufferedOutputStream bos = null;
        BufferedReader br=null;
        try {
            bis = new BufferedInputStream(new FileInputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\优化后的上传文件案例Test\\ClientDir\\day14-网络编程01.pdf"));
            bos = new BufferedOutputStream(sc.getOutputStream());
            int len;
            byte[] bytes = new byte[1024];
            while((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }
            sc.shutdownOutput();
            br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            int rlen;
            char[] chars = new char[1024];
            while((rlen = br.read(chars))!=-1){
                System.out.println(new String(chars,0,rlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bis!=null){
                bis.close();
            }
            if(sc!=null){
                sc.close();
            }
            if(br!=null){
                br.close();
            }
        }

    }
}
