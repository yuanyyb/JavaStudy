package Test9_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。*/
public class Test02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("Task\\src\\Test9_2\\b.txt",true);
            fos.write("i love java".getBytes());
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
