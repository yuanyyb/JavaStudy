package 基础语法练习.IO操作.输出输入流操作;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流操作 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt");
        FileWriter fw = new FileWriter("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\bbbb.txt",true);
        //每次读取一个字符
        /*int ch;
        while ((ch=fr.read())!=-1){
            fw.write((char)ch);
        }*/
        //每次读取一个字符数组（类似字节流读取）
        char[] buff = new char[1024];
        int len ;
        while ((len=fr.read(buff))!=-1){
            fw.write(buff,0,len);
        }
        fr.close();
        fw.close();

    }

}
