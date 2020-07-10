package 基础语法练习.TreeMap集合练习.Test01;

import java.util.Comparator;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        Student stu = new Student("张三",19);
        Student stu1 = new Student("李四",20);
        Student stu2 = new Student("王五",29);
        Student stu3 = new Student("赵六",19);
        /*TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(stu,"他大爷");
        tm.put(stu1,"他二爷");
        tm.put(stu2,"他三爷");
        tm.put(stu3,"他四爷");
        tm.forEach((k,v)->{
            System.out.println(k+"---"+v);
        });*/

        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                int res=o1.getAge() - o2.getAge();
                res = res==0?o1.getName().compareTo(o2.getName()):res;
                return res;
            }
        });
        tm.put(stu,"他大爷");
        tm.put(stu1,"他二爷");
        tm.put(stu2,"他三爷");
        tm.put(stu3,"他四爷");

        tm.forEach((k,v)->{
            System.out.println(k+"---"+v);
        });

    }
}
