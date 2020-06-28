package 基础语法练习.老师和学生继承人类案例;

public class Teacher extends Person {
    public Teacher(){
        //默认会调用父类的构造方法
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public static void teach(){
        System.out.println("老师教书育人");
    }

    @Override
    public void doSomeThing() {
        System.out.println(this.getName()+"，"+this.getAge()+"岁，应该做点什么呢？");
    }
}
