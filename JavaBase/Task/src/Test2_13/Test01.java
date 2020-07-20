package Test2_13;
/*定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println(getMin(1.111,2.222));
    }

    public static double getMin(double a,double b) {
        return a>=b?b:a;
    }
}
