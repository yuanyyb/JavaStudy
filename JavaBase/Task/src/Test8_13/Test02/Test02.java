package Test8_13.Test02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value*/
public class Test02 {

    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<String,String>();
        mp.put("1号","张三");
        mp.put("2号","李四");
        mp.put("3号","王五");
        mp.put("4号","赵六");

        System.out.println("----第一种增强for遍历-----");
        //1.
        Set<String> keys = mp.keySet();
        for(String key:keys)
        {
            System.out.println(key+"----"+mp.get(key));
        }
        System.out.println("----第二种迭代器遍历-----");
        //2.
        Set<Map.Entry<String,String>> entries = mp.entrySet();
        Iterator<Map.Entry<String,String>> itr = entries.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next().getKey()+"----"+itr.next().getValue());
        }
        System.out.println("----第三种forEach+Lambda遍历-----");
        //3.
        mp.forEach((k,v)->{
            System.out.println(k+"----"+v);
        });

    }

}
