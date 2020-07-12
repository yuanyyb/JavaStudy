package 基础语法练习.IO操作.输出输入流操作;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 输入流基本操作 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt");
            int b;
            byte[] by = new byte[1024];
            while((b = fis.read(by))!=-1){
                System.out.println(new String(by,0,1024));
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
        }
    }
}
