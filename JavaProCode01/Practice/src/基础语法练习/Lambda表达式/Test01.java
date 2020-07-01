package 基础语法练习.Lambda表达式;
//使用Lambda表达式的前提：
//1.必须有一个接口
//2.接口中有且仅有一个抽象方法
public class Test01 {
    public static void main(String[] args) {
        //1.无参无返回值
        tFun1(new TestInterface() {
            @Override
            public void fun1() {
                System.out.println("匿名内部类的方式调用接口中方法");
            }
        });

        tFun1(()->{
            System.out.println("Lambda方式调用接口中方法");
        });

        //有参数无返回值
        tFun2(new TestParInterface() {
            @Override
            public void fun2(String msg) {
                System.out.println("匿名内部类调用带参数接口方法:"+msg);
            }
        });

        tFun2((String msg)->{
            System.out.println("Lambda调用接口方法:"+msg);
        });

        //无参有返回值
        tFun3(new TestReturnInterface() {
            @Override
            public int fun3() {
                System.out.println("匿名函数调用无参带返回值的方法");
                return 1;
            }
        });

        tFun3(()->{
            System.out.println("Lambda调用无参带返回值方法");
            return 2;
        });


    }
    public static void tFun1(TestInterface t){
        t.fun1();
    }
    public static void tFun2(TestParInterface t){
        t.fun2("传入的参数");
    }
    public static void tFun3(TestReturnInterface t){
        System.out.println(t.fun3());
    }

}
//无参接口方法
interface TestInterface{
    public void fun1();
}
//带参数接口方法
interface TestParInterface{
    public void fun2(String msg);
}
//无参有返回值方法
interface TestReturnInterface{
    public int fun3();
}
