package 基础语法练习.继承和多态;

public class Cat extends Animal {
    int age = 10;
    int weight = 100;
    @Override
    public void eat(){
        System.out.println("年龄"+this.age+"猫吃鱼");
    }
}
