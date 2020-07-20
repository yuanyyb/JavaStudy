package Test6_6;

import java.util.Calendar;
//请使用Calendar将当前时间的年月日分别获取，并在控制台进行打印输出

public class Test02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONDAY)+1;
        int day = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
