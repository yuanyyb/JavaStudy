package Test6_5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*请编写程序，获取当前系统日期，并将结果打印到控制台，要求展示格式为：xxxx年xx月xx日
        运行结果：
        2088年2月15日*/
public class Test03 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf.format(d);
        System.out.println(time);
    }
}
