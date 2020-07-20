package 基础语法练习.时间对象;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2011,11,11,11,11,11);
        //LocalDateTime d = LocalDateTime.now();
        //1.常用方法：
        //d.getYear();//获取年
        //d.getMonthValue();//获取年
        //d.getDayOfYear();//获取当前日期是一年中的第几天(1~366)
        //System.out.println(d.getDayOfMonth());//获取当前日期在当月的第几天(1~31)
        //System.out.println(d.getDayOfWeek());//获取星期
        //d.getHour();//获取小时
        //d.getMinute();//获取分钟

        //2.时间对象转换
        //System.out.println(d.toLocalDate());//LocalDateTime转换为LocalDate
        //System.out.println(d.toLocalTime());//LocalDateTime转换为LocalTime
        //System.out.println(d.toString());

        //3.LocalDateTime对象format方法将时间对象转为字符串(使用格式化转换器DateFormatter)
        //DateTimeFormatter时间格式转换器，使用ofPattern方法得到DateFormatter对象，传入format方法
        //System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒")));

        //4.LocalDateTime的parse方法将字符串转为LocalDateTime时间对象(使用格式化转换器DateFormatter)
        //String s = "2011年11月11日 11:12:44";
        //LocalDateTime ddd = LocalDateTime.parse(s,DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
        //System.out.println(ddd);

        //5.LocalDateTime对象plus系列方法：将时间对象增加/减少年/月/日后的返回新时间对象
        //LocalDateTime ddd1 = ddd.plusYears(1);
        //System.out.println(ddd1);

        //6.LocalDateTime对象with系列方法：将时间对象修改年/月/日后返回新时间对象
        //LocalDateTime dd = d.withYear(2001);
        //System.out.println(dd);

        //7.Period 用于计算LocalDate日期之间的间隔
        //LocalDate ld1 = d.toLocalDate();
        //LocalDate ld2 = d.plusYears(10).plusMonths(11).plusDays(20).toLocalDate();
        //Period p = Period.between(ld1,ld2);//静态方法between获取Period对象
        //System.out.println(p);
        //System.out.println(p.toTotalMonths());//计算两个日期相差的总月份数

        //8.Duration 用于计算LocalDateTime的时分秒间隔
        //LocalDateTime d1 = d.plusHours(5).plusMinutes(10).plusSeconds(20);
        //Duration dur = Duration.between(d,d1);
        //System.out.println(dur);
        //System.out.println(dur.toSeconds());//获取相隔的秒数
        //System.out.println(dur.toMillis());


    }
}
