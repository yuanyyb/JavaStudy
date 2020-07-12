package 基础语法练习.IO操作.输出输入流操作;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//基本输出流操作练习
public class 输出流基本操作 {
    public static void main(String[] args){
        //第二个参数表示是否开启续写
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\aaaaaaaaaaaa.txt");
            //fos.write(99);
            String str = "你";
            fos.write("\r\n".getBytes());
            byte[] bytes = str.getBytes();
            fos.write(bytes);
            fos.write("\r\n".getBytes());
            fos.write(("长度:" + bytes.length + "").getBytes());
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fos!=null){
                try {
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
