package Test6_6;

import java.util.Calendar;

/*某某研发团队在2018年2月1号宣布，距离项目发版上线还剩100天，在这个时限内，我们务必要将项目搞定！
但100天以后到底是几月几号啊，我们总不能翻日历一天一天查吧，请使用技术手段，解决这一问题
        运行结果：
        100天后的时间为：2018年5月12日*/
public class Test03 {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        c.set(2018,2,1);
        c.add(Calendar.DATE,100);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");

    }
}
