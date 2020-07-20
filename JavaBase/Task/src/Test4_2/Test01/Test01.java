package Test4_2.Test01;
//键盘录入一个字符串，使用程序实现在控制台遍历该字符串。
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = sc.nextLine();
        for(int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
