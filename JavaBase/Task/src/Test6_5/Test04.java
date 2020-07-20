package Test6_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*某共公司产品经理要求App需要有3款主题样式，用户选择不同的主题，展示时间的格式也要有不同的风格，请编写代码实现该功能。
        运行结果：
        请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
        1
        主题切换成功,当前时间为：2018年12月10日

        请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
        4
        很抱歉，操作有误，已为您切换默认主题
        主题切换成功,当前时间为：2018年12月10日*/
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
            int sel = sc.nextInt();
            Date d = new Date();
            SimpleDateFormat sdf;
            /*if(sel==1){
                sdf = new SimpleDateFormat("yyyy年MM月dd日");
            }else if(sel==2){
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            }else if(sel==3){
                sdf = new SimpleDateFormat("yyyy/MM/dd");
            }else{
                System.out.println("很抱歉，操作有误，已为您切换默认主题");
                sdf = new SimpleDateFormat("yyyy年MM月dd日");
            }*/
            switch(sel){
                case 1:sdf = new SimpleDateFormat("yyyy年MM月dd日");break;
                case 2:sdf = new SimpleDateFormat("yyyy-MM-dd");break;
                case 3:sdf = new SimpleDateFormat("yyyy/MM/dd");break;
                default:System.out.println("很抱歉，操作有误，已为您切换默认主题");sdf = new SimpleDateFormat("yyyy年MM月dd日");break;
            }
            String timeStr = sdf.format(d);
            System.out.println("主题切换成功，当前时间为："+timeStr);


        }
    }
}
