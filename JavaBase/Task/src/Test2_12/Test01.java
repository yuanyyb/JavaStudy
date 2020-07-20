package Test2_12;
/*请定义一个方法，该方法可以实现求两个整数之中的较大值，并将较大值返回。
        请以重载的方式再定义一个方法，实现求三个整数之中的最大值，并将最大值返回。
        在主方法中分别调用这两个方法，测试结果。*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println(getMax(1,2));
        System.out.println(getMax(1,5,3));
    }

    public static int getMax(int a,int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
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
