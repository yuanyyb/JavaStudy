package 基础语法练习.TreeSet与Comparable接口配合使用;

public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age-o.age;//表示当前添加的元素的age如果大于前一个元素，按age升序排序
        int num = this.age-o.age;
        int num2 = num==0?this.name.compareTo(o.name):num;//名字的字母顺序
        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
