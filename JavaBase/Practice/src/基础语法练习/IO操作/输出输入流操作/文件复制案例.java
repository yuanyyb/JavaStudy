package 基础语法练习.IO操作.输出输入流操作;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*把“Practice\src\基础语法练习\IO操作\输出输入流操作\aaaaaaaaaaaa.txt”
复制到模块目录下的“Practice\src\基础语法练习\IO操作\输出输入流操作\bbbbbb.txt” (文件可以是任意文件)*/
public class 文件复制案例 {
    public static void main(String[] args) {
        FileInputStream fis  = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt");
            fos = new FileOutputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\bbbbbb.txt");
            int len;
            byte[] bys = new byte[1024];
            while((len = fis.read(bys))!=-1){
                fos.write(bys,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
