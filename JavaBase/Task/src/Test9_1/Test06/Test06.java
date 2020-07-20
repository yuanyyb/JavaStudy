package Test9_1.Test06;

import java.io.File;
import java.io.IOException;

/*获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
答案:
操作步骤:
1.    在D盘aaa文件夹中创建一个b.txt文件并输入数据
2.    创建文件对象关联路径：d:/aaa/b.txt
3.    调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法*/
public class Test06 {
    public static void main(String[] args) throws IOException {
//        File file = new File("Task\\src\\Test9_1\\Test06\\aaa");
//        file.mkdirs();
//        File file1 = new File(file,"a.txt");
//        file1.createNewFile();
        File file = new File("Task\\src\\Test9_1\\Test06\\aaa\\a.txt");
        String fileName = file.getName();
        long fileSize= file.length();
        String absolutePath = file.getAbsolutePath();
        String parentPath = file.getParent();
        System.out.println(fileName);
        System.out.println(fileSize);
        System.out.println(absolutePath);
        System.out.println(parentPath);
    }
}
