package Test2_13;
/*定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。*/
public class Test02 {
    public static void main(String[] args) {
        System.out.println("最大值是："+getMax(1,9,222));
    }

    public static int getMax(int a,int b,int c) {
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
