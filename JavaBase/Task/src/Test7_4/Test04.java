package Test7_4;
/*定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
姓名和年龄相同的人看做同一人不存储*/
import java.util.HashSet;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<Person>();
        hs.add(new Person("张三",10));
        hs.add(new Person("李四",11));
        hs.add(new Person("王五",12));
        hs.add(new Person("王五",12));
        hs.add(new Person("钱六",18));
        System.out.println(hs.toString());

    }
}
