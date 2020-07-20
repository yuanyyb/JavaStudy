package Test5_1.Test02;

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder("张三","0001",10000);
        c.work();

        Manager m = new Manager("里斯","0002",30000,9000);
        m.work();
    }
}
