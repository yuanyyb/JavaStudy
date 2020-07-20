package 基础语法练习;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("你好");
        list.add("hello");
        list.add("刷我的卡");
        list.add(3,"萨瓦迪卡");
        System.out.println(list);
        list.remove("你好");
        //list.remove(1);
        list.set(1,"helloworld");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
