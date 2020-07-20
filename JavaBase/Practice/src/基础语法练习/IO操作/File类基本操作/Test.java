package 基础语法练习.IO操作.File类基本操作;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        1.createNewFile()只能创建文件,如果文件存在创建失败，成功则返回true
        String path ="C:\\JavaStudy\\IDEA\\JavaProCode01\\Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
        String name ="aaa.txt";
//        File file = new File(path,name);
//        boolean res = file.createNewFile();
//        System.out.println(res);
//        2.mkdir();只能创建文件夹，只能创建单级文件夹，成功返回true；
//        path = "Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file2 = new File(path,"aaa");
//        boolean res2 = file2.mkdir();
//        System.out.println(res2);
//        3.mkdirs();只能创建文件夹，可以创建多级文件夹
//        path = "Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file3 = new File(path,"aaa\\bbb\\ccc");
//        boolean res3 = file3.mkdirs();
//        System.out.println(res3);
//        4.delete();删除文件或文件夹(不走回收站直接删除)，只能删除空文件夹或文件
//        path="Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file4 = new File(path,"aaa\\bbb");
//        System.out.println(file4.delete());

//        5.isFile();判断file对象指定的路径是否为文件
//        path="Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file5 = new File(path,"aaa");
//        System.out.println(file5.isFile());
//        System.out.println(file5.isDirectory());
//        6.isDirectory();判断file对象是否为文件夹
//        7.exists();判断file指向的文件夹或文件是否存在
//        path = "Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file7 = new File(path,"aaa");
//        System.out.println(file7.exists());
//        8.getName();如果file为文件则获取文件名和后缀，如果是文件夹则获取的是文件夹的名字(都不含路径)
//        path = "Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
//        File file7 = new File(path);
//        //System.out.println(file7.createNewFile());
//        System.out.println(file7.getName());
//        9.file.listFiles();返回file抽象路径对象内的文件夹或文件file对象数组
        path = "Practice\\src\\基础语法练习\\IO操作\\File类基本操作";
        File file = new File(path,"aaa1");
        System.out.println(file.listFiles());

//        Arrays.stream(file.listFiles()).forEach(a-> System.out.println(a));


    }
}
