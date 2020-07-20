package Test4_2.Test02;
/*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。*/
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        int zm = 0;
        int sz = 0;
        int qt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='z'){
                zm++;
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                sz++;
            }else{
                qt++;
            }
        }
        System.out.println("输入内容中字母"+zm+"个，数字"+sz+"个，其它"+qt+"个");
    }

}
