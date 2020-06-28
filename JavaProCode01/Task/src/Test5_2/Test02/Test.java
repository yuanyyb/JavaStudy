package Test5_2.Test02;

public class Test {
    public static void main(String[] args) {
        Person p = new SuperMan();
        p.eat();
        p.work();
        SuperMan s = (SuperMan)p;
        s.Save();
    }
}
