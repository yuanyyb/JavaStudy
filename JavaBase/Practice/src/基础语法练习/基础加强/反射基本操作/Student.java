package 基础语法练习.基础加强.反射基本操作;

public class Student {
    private String name;
    private int age;
    public String desc;
    public String genaral;
    public Student() {
    }

    private Student(String name){
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("学生学习！");
    }

    public void study(String km){
        System.out.println("学生学习！"+km);
    }

    private void pStudy(){
        System.out.println("私有方法");
    }
    //带返回值的方法
    public int getSum(int a,int b){
        System.out.println("调用有返回值的方法");
        return a+b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", genaral='" + genaral + '\'' +
                '}';
    }
}
