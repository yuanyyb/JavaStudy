package Test6_4;
/*现获取到两个字符串格式的数字：字符串23和字符串24。请编写程序，计算两个数字的和，并输出在控制台。
        运行结果：
        相加结果为：47*/
public class Test01 {
    public static void main(String[] args) {
        String a = "23",b="24";
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        System.out.println("相加结果为："+(x+y));
    }
}
