package 基础语法练习.IO操作.输出输入流操作;

import java.io.*;

public class 字节缓冲输入输出流复制文件操作 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\day10IO流01.pdf"));
            bos = new BufferedOutputStream(new FileOutputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\day10IO流01_副本.pdf"));
            //一次读写一个字节数组
            int len;
            byte[] bys = new byte[1024];
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
            //一次读取一个字节
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
