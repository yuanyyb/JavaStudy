package Test6_5;
//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test01 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(now);
        System.out.println(time);
    }
}
