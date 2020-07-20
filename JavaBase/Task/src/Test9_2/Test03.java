package Test9_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”*/
public class Test03 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("Task\\src\\Test9_2\\b.txt",true);
            fos.write("\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
