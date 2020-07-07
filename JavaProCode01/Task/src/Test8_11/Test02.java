package Test8_11;

import java.util.HashSet;
import java.util.Iterator;

//定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储
public class Test02 {
    public static void main(String[] args) {
        Person p1 = new Person("小红",10);
        Person p2 = new Person("小明",20);
        Person p3 = new Person("小苟",21);
        Person p4 = new Person("小明",20);//重复不添加进去
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        Iterator<Person> iterator = hs.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
