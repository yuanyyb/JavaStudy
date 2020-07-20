package 基础语法练习.抽象类和接口实现多态练习;

public class Cat extends Animal implements Jumping {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    @Override
    public void jump(){
        System.out.println("猫跳高");
    }
}
