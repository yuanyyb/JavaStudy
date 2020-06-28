package Test4_5.Test05;
/*请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
        ### 训练目标
        字符串的反转功能，判断是否相等功能*/
public class Test05 {
    public static void main(String[] args) {
        System.out.println(jugeStrIsReverse("上海自来水来自海上"));
    }

    public static boolean jugeStrIsReverse(String str) {
        boolean res =false;
        StringBuilder sb = new StringBuilder(str);
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
            res = true;
        }
        return res;
    }
}
