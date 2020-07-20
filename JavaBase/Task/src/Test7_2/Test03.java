package Test7_2;

import java.util.ArrayList;
import java.util.Collection;

/*
定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。*/
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> cs = new ArrayList<>();
        cs.add("张三");
        cs.add("李四");
        cs.add("王五");
        System.out.println(ListTest(cs,"张三"));

    }

    public static boolean ListTest(ArrayList<String> al,String s) {
        return al.contains(s);
    }
}
