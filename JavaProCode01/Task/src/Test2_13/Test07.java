package Test2_13;

import org.w3c.dom.ls.LSOutput;

/*请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。四舍五入之后的结果
是一个int整数类型并返回。最后对方法进行测试。*/
public class Test07 {
    public static void main(String[] args) {
        System.out.println(getSSWR(8.0111));
    }

    public static int getSSWR(double a) {
        int res = (int)a;
        double xs = a-res;
        if(xs>=0.5){
            res++;
        }
        return res;
    }
}
