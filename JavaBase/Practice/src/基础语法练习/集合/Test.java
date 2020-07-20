package 基础语法练习.集合;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        /*List<String> c = new ArrayList<String>();
        c.add("你好");
        c.add("骚年");
        //Iterator<String> it = c.iterator();
        ListIterator<String> it = c.listIterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("你好")){
                it.add("Hello");
            }
        }
        System.out.println(c);*/

       /* System.out.println("重地你好".hashCode());
        System.out.println("通话迭代".hashCode());*/
        /*Collection<String> c = new ArrayList<String>();
        c.add("你好");
        c.add("骚年");
        c.contains("");
        System.out.println(c);*/


        /*Collection<String> arr=new ArrayList<String>();
        arr.add("张无忌");
        arr.add("张翠山");
        arr.add("赵敏");
        arr.add("杨不悔");
        Iterator<String> iterator = arr.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("张翠山")){
                //arr.remove("张翠山"); //此时报并发修改异常
                iterator.remove();//此时不报异常且成功删除(此处调用的Itr)
            }
        }
        System.out.println(arr);*/

        Map<String,String> map = new HashMap<>();
        map.put("1号丈夫","1号妻子");
        map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");

        //1.第一种遍历
        Set<String> keys = map.keySet();
        for(String key:keys)
        {
            System.out.println(key+"----"+map.get(key));
        }
        //2.第二种遍历
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry :entries)
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"---"+value);
        }
        //3.forEach(lambda)遍历
        map.forEach((key,value)->{
            System.out.println(key+"---"+value);
        });



    }

}
