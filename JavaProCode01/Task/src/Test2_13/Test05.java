package Test2_13;
/*在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：

        ```
        请输入第一个整数：10
        请输入第二个整数：30
        请输入第三个整数：20
        从大到小的顺序是： 30 20 10*/
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个数:");
        int a = sc.nextInt();
        System.out.println("请您输入第二个数:");
        int b = sc.nextInt();
        System.out.println("请您输入第三个数:");
        int c = sc.nextInt();
        printNum(a,b,c);
    }

    public static void printNum(int a,int b,int c) {
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(max==a){
            if(b>c){
                print(a,b,c);
            }else{
                print(a,c,b);
            }
        }
        if(max==b){
            if(a>c){
                print(b,a,c);
            }else{
                print(b,c,a);
            }
        }
        if(max==c){
            if(a>b){
                print(c,a,b);
            }else{
                print(c,b,a);
            }
        }
    }

    public static void print(int x,int y,int z) {
        System.out.println(x+" "+y+" "+z );
    }
}
