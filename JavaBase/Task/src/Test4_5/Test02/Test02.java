package Test4_5.Test02;

import java.util.ArrayList;
import java.util.Random;

/*在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
7Kt5*/
public class Test02 {
    public static void main(String[] args) {
        String res = getCode(4);
        System.out.println(res);
    }

    public static String getCode(int n) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(char i='0';i<='9';i++){
            sb.append(i);
        }
        for(char i='A';i<='Z';i++){
            sb.append(i);
        }
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        for(int i=0;i<n;i++){
            int x = r.nextInt(sb.length());
            sb1.append(sb.charAt(x));
        }
        return sb1.toString();
    }
}
