package 基础语法练习.网络编程.TCP.文件上传程序优化;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class FileUploadServerThread implements Runnable {
    BufferedInputStream bis=null;
    BufferedOutputStream bos=null;
    BufferedWriter bw=null;
    Socket socket;
    public FileUploadServerThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            bis = new BufferedInputStream(socket.getInputStream());
            String fileName = UUID.randomUUID().toString().replaceAll("-", "");
            bos = new BufferedOutputStream(new FileOutputStream("Practice\\src\\基础语法练习\\网络编程\\TCP\\文件上传程序优化\\ServerDir\\" + fileName + ".pdf"));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传文件成功");
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bw!=null){
                    bw.close();
                }
                if(bos!=null){
                    bos.close();
                }
                if(bis!=null){
                    bis.close();
                }
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
