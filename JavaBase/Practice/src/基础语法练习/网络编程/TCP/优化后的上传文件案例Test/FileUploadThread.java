package 基础语法练习.网络编程.TCP.优化后的上传文件案例Test;

import java.io.*;

import java.net.Socket;
import java.util.UUID;

public class FileUploadThread implements Runnable {
    private Socket socket;

    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        BufferedWriter bw=null;
        try {
            bis= new BufferedInputStream(socket.getInputStream());

            String fileName = UUID.randomUUID().toString().replace("-","");
            bos = new BufferedOutputStream(new FileOutputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\优化后的上传文件案例Test\\ServerDir\\"+fileName+".pdf"));
            byte[] bytes = new byte[1024];
            int len;
            while((len = bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bw!=null){
                    bw.close();
                }
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
