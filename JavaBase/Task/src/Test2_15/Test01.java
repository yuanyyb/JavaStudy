package Test2_15;
/*通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，
使用switch和if两种判断语句分别完成。
        ?            周一：跑步
        ?            周二：游泳
        ?            周三：慢走
        ?            周四：动感单车
        ?            周五：拳击
        ?            周六：爬山
        ?            周日：好好吃一顿*/
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int day = sc.nextInt();
        /*if(day>=1&&day<=7){
            if(day==1){
                System.out.println("跑步");
            }else if(day==2){
                System.out.println("游泳");
            }else if(day==3){
                System.out.println("慢走");
            }else if(day==4){
                System.out.println("动感单车");
            }else if(day==5){
                System.out.println("拳击");
            }else if(day==6){
                System.out.println("爬山");
            }else if(day==7){
                System.out.println("好好吃一顿");
            }
        }else{
            System.out.println("输入星期数错误");
        }*/
        switch(day){
            case 1:System.out.println("跑步");break;
            case 2:System.out.println("游泳");break;
            case 3:System.out.println("慢走");break;
            case 4:System.out.println("动感单车");break;
            case 5:System.out.println("拳击");break;
            case 6:System.out.println("爬山");break;
            case 7:System.out.println("好好吃一顿");break;
            default:System.out.println("输入星期数错误");break;
        }
    }
}
