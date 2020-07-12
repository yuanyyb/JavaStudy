package Test9_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("Task\\src\\Test9_2\\代码是我的生命.jpg");
            fos = new FileOutputStream("Task\\src\\Test9_2\\代码是我的生命_副本.jpg");
            int len;
            byte[] by = new byte[1024];
            while((len=fis.read(by))!=-1){
                fos.write(by,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(fos!=null){
                    fos.close();
                }
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
