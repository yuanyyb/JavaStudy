package 基础语法练习.TreeMap集合练习.Test01;

public class Student /*implements Comparable<Student>*/{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(Student o) {
        int res = this.age-o.age;
        res = res==0?this.name.compareTo(o.name):res;
        return res;
    }*/
}
