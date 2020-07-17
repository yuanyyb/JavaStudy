package 基础语法练习.IO操作.输出输入流操作;

import java.io.*;

public class 字符缓冲流操作 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\cccc.txt",true));
        /*int ch;
        while((ch=br.read())!=-1){
            bw.write((char)ch);
        }
*/

        /*char[] chars = new char[1024];
        int len;
        while((len=br.read(chars))!=-1){
            bw.write(chars,0,len);
        }*/

        //特殊方法：br.readLine（）；每次读取一行，无数据读取时返回null,注意不会读取/r/n回车换行
        //        bw.newLine();写入一行回车换行
        String s;
        bw.newLine();
        while((s=br.readLine())!=null){
            bw.newLine();
            bw.write(s);
        }
        br.close();
        bw.close();
    }
}
