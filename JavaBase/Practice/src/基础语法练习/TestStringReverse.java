package 基础语法练习;

public class TestStringReverse {
    public static void main(String[] args) {
        String a = "abc11111111ttttttttyyyyyyyuuuuuuuu";
//        String s = "";
//        for(int i = a.length()-1;i>=0;i--){
//            s+=a.charAt(i);
//        }
        String s = StringBuilderReverse(a);
        System.out.println(s);

    }

    public static String StringBuilderReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
