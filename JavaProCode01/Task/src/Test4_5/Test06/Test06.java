package Test4_5.Test06;
/*我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。*/
public class Test06 {
    public static void main(String[] args) {
        System.out.println(jugeIsIdCard("11234567891234567X"));
    }
    //判断是否为身份证号
    public static boolean jugeIsIdCard(String idCard) {
        boolean res = true;
        StringBuilder sb = new StringBuilder(idCard);
        if(sb.length()!=18){
            res = false;
        }else{
            if(sb.charAt(0)=='0'){
                res = false;
            }else{
                for(int i=0;i<sb.length()-1;i++){
                    if(sb.charAt(i)<'0'&&sb.charAt(i)>'9'){
                        res = false;
                    }
                }
                if((sb.charAt(sb.length()-1)<'0'||sb.charAt(sb.length()-1)>'9')&&sb.charAt(sb.length()-1)!='X'){
                    res = false;
                }
            }
        }
        return res;
    }
}

