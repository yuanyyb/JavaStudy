package 基础语法练习.IO操作.输出输入流操作;

import java.io.*;
import java.util.ArrayList;

public class 对象输入输出流操作 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("小丽", 18);
        Student stu1 = new Student("杜子腾", 19);
        Student stu2 = new Student("中年大叔", 22);
        //如果设置成可续写则抛出StreamCorruptedException异常
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\eeee.txt",true));
        oos.writeObject(stu);
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\输出输入流操作\\eeee.txt"));
        while (true) {
            try {
                Object s = ois.readObject();
                System.out.println(s);
            } catch (EOFException e) {
                break;
            }
        }

        ois.close();
    }
}

