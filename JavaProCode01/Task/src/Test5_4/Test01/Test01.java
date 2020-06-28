package Test5_4.Test01;
/*请完善下列代码，在main方法中调用Inner的method方法，并依次在控制台输出30,20,10

public class Demo3 {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
    }
}

class Outer {
    int num = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            // ---完善代码---
            System.out.println();       // 输出30
            System.out.println();       // 输出20
            System.out.println();       // 输出10
        }
    }
}

运行结果
        30
        20
        10*/
public class Test01 {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
        Outer o = new Outer();
        o.new Inner().method();
    }
}
