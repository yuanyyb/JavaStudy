package Test2_13;
/*我们知道数学中有九九乘法表。请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n，测试方法。执行效果如下：

        ```
        请输入一个1-9之间的整数：
        4
        乘法表：
        1×1=1
        1×2=2    2×2=4
        1×3=3    2×3=6    3×3=9
        1×4=4    2×4=8    3×4=12    4×4=16*/
import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        System.out.println("请您输入1~9的整数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1||n>9){
            System.out.println("请输入1~9的数字");
        }else{
            print99(n);
        }
    }

    public static void print99(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
