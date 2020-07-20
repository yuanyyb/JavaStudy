package 基础语法练习.IO操作.输出输入流操作;

import java.io.*;

public class 转换流操作 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader 将字节转换为字符读取流,构造方法可指定编码格式
        //OutputStreamWriter 将字符转换为字节写入流
        InputStreamReader ir = new InputStreamReader(new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt"),"GBK");
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\dddd.txt",true),"UTF-8");
        /*int ch;
        while((ch=ir.read())!=-1){
            ow.write((char)ch);
        }*/
        ow.write("\r\n");
        ow.write("\r\n");
        char[] buff = new char[1024];
        int len;
        while((len=ir.read(buff))!=-1){
            ow.write(buff,0,len);
        }
        ir.close();
        ow.close();
    }
}
