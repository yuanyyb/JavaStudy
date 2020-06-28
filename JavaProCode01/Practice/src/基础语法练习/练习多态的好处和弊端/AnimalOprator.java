package 基础语法练习.练习多态的好处和弊端;

public class AnimalOprator {
//    public void opAnimal(Cat c){
//        System.out.println("猫的方法");
//        c.eat();
//    }
//    public void opAnimal(Dog d){
//        System.out.println("狗的方法");
//        d.eat();
//    }
    public void opAnimal(Animal a){
        System.out.println("动物的方法");
        a.eat();
    }
}
