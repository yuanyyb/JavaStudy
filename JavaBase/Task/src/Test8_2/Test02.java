package Test8_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）*/
public class Test02 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> ito = list.iterator();
        int n = list.size();
        Object[] arr = new Object[n];
        arr = list.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
