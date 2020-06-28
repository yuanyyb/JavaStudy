package 基础语法练习.TreeSet与Comparable接口配合使用;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        /*Student s1 = new Student(10,"张三");
        Student s2 = new Student(12,"李四");
        Student s3 = new Student(14,"王五");
        Student s4 = new Student(12,"王三");
        Student s5 = new Student(12,"王三");
        TreeSet<Student> ts  = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Student s : ts){
            System.out.println(s);
        }*/

        /*Teacher s1 = new Teacher(10,"张三");
        Teacher s2 = new Teacher(12,"李四");
        Teacher s3 = new Teacher(14,"王五");
        Teacher s4 = new Teacher(12,"王三");
        Teacher s5 = new Teacher(12,"王三");

        TreeSet<Teacher> ts = new TreeSet<Teacher>(new Comparator<Teacher>(){
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int num = o1.getAge()-o2.getAge();
                int num1 = num==0?o1.getName().compareTo(o2.getName()):num;
                return num1;
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Teacher s : ts){
            System.out.println(s);
        }*/

        /*按照总分排序*/
        TreeSet<Stu> ts = new TreeSet<>(
                new Comparator<Stu>() {
                    @Override
                    public int compare(Stu o1, Stu o2) {
                        int num = o1.getSumScore()-o2.getSumScore();
                        int num1 = o1.getChinesScore()-o2.getChinesScore();
                        int num2 = o1.getMathScore()-o2.getMathScore();
                        int num3 = num==0?(num1==0?(num2==0?o1.getName().compareTo(o2.getName()):num2):num1):num;
                        return num3;
                    }
                }
        );
        ts.add(new Stu("张三",98,99));
        ts.add(new Stu("李四",98,99));
        ts.add(new Stu("王五",98,99));
        ts.add(new Stu("孙六",98,99));
        for(Stu s:ts){
            System.out.println(s);
        }

    }
}
