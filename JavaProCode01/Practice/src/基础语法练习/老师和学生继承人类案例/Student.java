package 基础语法练习.老师和学生继承人类案例;

public class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println("学生好好学习");
    }
    @Override
    public void doSomeThing(){
        System.out.println("学生"+this.getName()+","+this.getAge()+"岁，你就好好学习，别瞎猜老师在干啥！！！");
    }
    public void doSomeThing(String s){
        super.doSomeThing();
    }
}
