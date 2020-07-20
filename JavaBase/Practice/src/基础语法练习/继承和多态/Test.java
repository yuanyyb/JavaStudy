package 基础语法练习.继承和多态;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
        a.eat();
    }
}
