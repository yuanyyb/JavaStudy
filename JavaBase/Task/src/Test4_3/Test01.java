package Test4_3;
/*定义一个方法,把用户键盘录入的字符串,进行反转.*/
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder(line);
        System.out.println("反转后的结果是："+sb.reverse().toString());
    }

}
