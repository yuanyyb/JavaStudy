package 基础语法练习.多态实现操作动物类;

import 基础语法练习.抽象类和接口实现多态练习.Jumping;

public class Cat extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫能跳高！！");
    }
}
