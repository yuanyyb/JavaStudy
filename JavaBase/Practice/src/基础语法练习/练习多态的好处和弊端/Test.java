package 基础语法练习.练习多态的好处和弊端;

public class Test {
    public static void main(String[] args) {
//        AnimalOprator ao = new AnimalOprator();
//        Cat c = new Cat();
//        ao.opAnimal(c);
//
//        Dog d = new Dog();
//        ao.opAnimal(d);

        Animal a = new Dog();
        a.eat();
        Dog dd = (Dog)a;
        dd.lookDoor();

    }
}
