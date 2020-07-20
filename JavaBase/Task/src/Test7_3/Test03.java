package Test7_3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫*/
public class Test03 {
    public static void main(String[] args) {
        String[] arr = {"张三","李四","王五","二丫","钱六","孙七"};
        List<String> list = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println("替换前的集合："+list.toString());
        //此处使用ListIterator迭代器配合add方法替换
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            if(lit.next().equals("二丫")){
                lit.remove();
                lit.add("王小丫");
            }
        }
        System.out.println("替换后的集合："+list.toString());
    }
}
