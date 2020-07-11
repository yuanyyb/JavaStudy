package 基础语法练习.IO操作.File练习;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String path ="Practice\\src\\基础语法练习\\IO操作\\File练习\\aaa";
        File file = new File(path);
//        boolean res = new File(file,"cc.txt").createNewFile();
//        System.out.println(res);
        if(!file.exists()){
            file.mkdirs();
        }
        new File(file,"cc.txt").createNewFile();
    }
}
