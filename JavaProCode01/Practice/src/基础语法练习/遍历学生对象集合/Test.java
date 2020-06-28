package 基础语法练习.遍历学生对象集合;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        Student s1 = new Student();
        s1.setName("李四");
        s1.setAge(19);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s);
        list.add(s1);
        for(int i=0;i<list.size();i++){
            Student stu = list.get(i);
            System.out.println(stu.getName()+":"+stu.getAge()+"岁");
        }
//        s.equals(s1);
//        s.toString();
    }

}
