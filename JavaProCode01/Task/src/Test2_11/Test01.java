package Test2_11;
/*请定义一个方法，该方法的功能是在控制台打印九九乘法表。方法实现完毕，请在主方法中调用方法，查看打印结果。*/
public class Test01 {
    public static void main(String[] args) {
        Get99Multiplication();
    }
    public static void Get99Multiplication(){
        for(int i =1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
