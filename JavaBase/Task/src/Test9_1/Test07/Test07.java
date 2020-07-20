package Test9_1.Test07;

import java.io.File;
import java.io.IOException;

/*描述:
1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)*/
public class Test07 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task\\src\\Test9_1\\Test07\\aaa\\bbb");
        file.mkdirs();
        File file2 = new File(file,"aaa.txt");
        file2.createNewFile();
        jugeFile(file2);


    }

    private static void jugeFile(File file) {
        String fileName = file.getName();
        if(file.isFile()){
            System.out.println(fileName+"是一个文件");
        }else if(file.isDirectory()){
            System.out.println(fileName+"是一个文件夹");
        }else{
            System.out.println("----");
        }
    }
}
