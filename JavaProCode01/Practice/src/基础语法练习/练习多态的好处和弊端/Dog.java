package 基础语法练习.练习多态的好处和弊端;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
