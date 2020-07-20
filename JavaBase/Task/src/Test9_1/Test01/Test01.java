package Test9_1.Test01;

import java.io.File;
import java.io.IOException;

/*1、描述:创建两个文件对象，分别使用相对路径和绝对路径创建。*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        //相对路径
        File file = new File("Task\\src\\Test9_1\\Test01\\aaa.txt");
        file.createNewFile();
        //绝对路径
        File file2 = new File("C:\\JavaStudy\\IDEA\\JavaProCode01\\Task\\src\\Test9_1\\Test01\\bbb.txt");
        file2.createNewFile();

    }
}
