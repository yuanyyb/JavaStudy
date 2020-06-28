package Test3_2.Test03;

public class Test {
    public static void main(String[] args) {
        Manager man = new Manager("项目经理",1110,20000,10000);
        man.work();
        Coder coder = new Coder("程序员",11101,10000);
        coder.work();
    }
}
