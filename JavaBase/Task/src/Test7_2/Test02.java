package Test7_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）*/
public class Test02 {
    public static void main(String[] args) {
        Collection c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(4);
        c.add(6);
        c.add(4);
        int size = c.size();
        /*Object[] arr = new Object[size];
        Iterator<Integer> it = c.iterator();
        for(int i=0;i<size;i++){
            if(it.hasNext()) {
                arr[i] = it.next();
            }
        }*/
        Object[] arr = c.toArray();
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
