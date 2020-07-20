package Test5_1.Test01;
/*分析事物的共性，并抽取出正确的继承体系
现有基础班老师（BaseTeacher）和就业班老师（WorkTeacher）两个类，两者都含有姓名和年龄两个属性，
还有一个讲课的行为teach，但不同的是，基础班老师的teach方法输出【基础班老师讲JavaSE】，
就业班老师的teach方法输出【就业班老师讲JavaEE】，请用代码实现。
        运行结果：
        张三老师...23
        基础班老师讲JavaSE
        李四老师...24
        就业班老师讲JavaEE*/
public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void teach(){
        System.out.println("老师教书育人");
    }
}
