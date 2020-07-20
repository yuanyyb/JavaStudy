package 基础语法练习.抽象类和接口实现多态练习;

public class Test {
    public static void main(String[] args) {
        Jumping c = new Cat();
        c.jump();

        Animal a = new Cat();
        a.setName("英短");
        a.setAge(5);
        System.out.println(a.getName()+a.getAge()+"岁");
        a.eat();
        ((Cat)a).jump();

        Cat cc = new Cat("美短",5);
        System.out.println(cc.getName()+cc.getAge()+"岁");
        cc.eat();
        cc.jump();
    }
}
