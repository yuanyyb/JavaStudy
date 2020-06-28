package Test6_6;

import java.util.Calendar;

//用程序判断2018年2月14日是星期几。
public class Test01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018,1,14);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch(week){
            case 1:
                System.out.println("星期日");
                break;
            case 2:
                System.out.println("星期一");
                break;
            case 3:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期三");
                break;
            case 5:
                System.out.println("星期四");
                break;
            case 6:
                System.out.println("星期五");
                break;
            case 7:
                System.out.println("星期六");
                break;
        }

    }
}
