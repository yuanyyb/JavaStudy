package Test4_5.Test04;

import java.util.Scanner;

/*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。*/
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        int zm = 0;
        int sz =0;
        int qt=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'){
                zm++;
            }else if(sb.charAt(i)>='0'&&sb.charAt(i)<='9'){
                sz++;
            }else{
                qt++;
            }
        }
        System.out.println(str+"中字母："+zm+"个，数字："+sz+"个,其它"+qt+"个。");
    }
}
