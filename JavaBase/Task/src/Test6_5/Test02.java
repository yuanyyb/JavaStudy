package Test6_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。*/
public class Test02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2018-03-04");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf1.format(d);
        System.out.println(time);
    }
}
