package Test9_1.Test05;

import java.io.File;
import java.io.IOException;

/*将D盘下a.txt文件删除
将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。*/
public class Test05 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task\\src\\Test9_1\\Test05\\aaa\\bbb");
        if(!file.exists()){
            file.mkdirs();
        }
        File file1 = new File(file,"a.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        System.out.println(file1.exists());
        file1.delete();
        File file3 = new File("Task\\src\\Test9_1\\Test05\\aaa\\bbb");
        if(file3.exists()){
            file3.delete();
        }
        File file4 = new File("Task\\src\\Test9_1\\Test05\\aaa");
        if(file4.exists()){
            file4.delete();
        }


    }
}
