package 基础语法练习.匿名内部类案例;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        JumpOper j = new JumpOper();
        j.jumpOp(c);

        Jumpping oJ = new Jumpping(){
            @Override
            public void jump(){
                System.out.println("重写的jump方法");
            }
        };
        oJ.jump();

        Test d=new Test();
        Inner i = d.new Inner();//内部类

    }

    public void func(){
        //位置1
    }
    class Inner{

    }

}
