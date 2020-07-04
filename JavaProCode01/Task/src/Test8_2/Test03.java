package Test8_2;

import java.util.ArrayList;
import java.util.Collection;


/*定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。*/
public class Test03 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        String s = "";
        boolean res = listTest(list, s);
    }

    private static boolean listTest(Collection<String> list, String s) {
        return list.contains(s);
    }
}
