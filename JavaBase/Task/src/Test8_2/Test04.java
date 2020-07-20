package Test8_2;

import java.util.ArrayList;

/*定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/
public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ssss");
        boolean res = listTest(al);
        System.out.println(res);
    }

    private static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }
}
