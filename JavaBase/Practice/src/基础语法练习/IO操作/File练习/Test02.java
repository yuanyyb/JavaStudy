package 基础语法练习.IO操作.File练习;

import java.io.File;

//删除文件夹及其内容
public class Test02 {
    public static void main(String[] args) {
        File file= new File("Practice\\src\\基础语法练习\\IO操作\\File练习\\aaa");
        deleteDir(file);
    }

    private static void deleteDir(File file) {
        File[] files = file.listFiles();
        for (File f :files){
            if(f.isFile()){
                f.delete();
            }else{
                deleteDir(f);
            }
        }
        file.delete();
    }
}
