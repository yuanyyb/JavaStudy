package Test6_1;
/*生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题*/
public class Test01 {
    public static void main(String[] args) {
        double rf = Math.random()*10000.0;
        System.out.println(rf);
        int r = (int)(rf);
        String res = "" + r/100.0;
        System.out.println(res);

    }
}
