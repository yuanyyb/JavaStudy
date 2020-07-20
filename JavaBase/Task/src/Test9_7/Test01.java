package Test9_7;

import java.io.*;

/*对象序列化是一个用于将对象状态转换为字节流的过程，可以将其保存到磁盘文件中
或通过网络发送到任何其他程序；从字节流创建对象的相反的过程称为反序列化。
现已知学生实体类（Student），包含姓名和年龄属性。请编写程序将若干学生对象
保存到当前模块的下的object.txt文件中，保存成功后，还可以读取文件获取到这些学生对象。
提示：
从文件中读取对象时，与读取其他数据不同，readObject方法是通过抛出
异常（EOFException）来表示到达文件末尾的，所以循环读取多个对象时，
可以通过捕获该异常来结束读取。除了这种方式还可以怎样比较方便的将多个
学生对象只读写一次，以避免此问题？*/
public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("小丽", 18);
        Student stu1 = new Student("杜子腾", 19);
        Student stu2 = new Student("中年大叔", 22);
        //如果设置成可续写则抛出StreamCorruptedException异常
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Task\\src\\Test9_7\\aaa.txt"));
        oos.writeObject(stu);
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Task\\src\\Test9_7\\aaa.txt"));
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
