package Test5_3.Test01;

public class Demo1 {
    /*
     * 请编写程序, 打印出接口中的变量num, 随后调用method方法
     * 要求程序与最终运行结果吻合
     */
    public static void main(String[] args) {
        System.out.println(Inter.num);//static final修饰 静态最终的变量 即常量
        Inter i = new Test();
        System.out.println(i.num);//接口变量调用
        i.method();

    }
}
