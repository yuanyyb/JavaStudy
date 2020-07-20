package Test7_2;

import java.util.ArrayList;

/*定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/
public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> cs = new ArrayList<>();
        cs.add("张三");
        cs.add("李四");
        cs.add("王五");
        System.out.println(ListTest(cs,"张三"));

    }

    public static boolean ListTest(ArrayList<String> al,String s) {
        return al.isEmpty();
    }
}
