package Test9_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。*/
public class Test01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Task\\src\\Test9_2\\a.txt");
            fos.write(97);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
