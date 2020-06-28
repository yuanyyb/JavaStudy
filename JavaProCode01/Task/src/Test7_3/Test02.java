package Test7_3;

import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.remove("张三");
        String s = list.get(1);
        int size = list.size();
        System.out.println(list);
        //list.clear();

        list.addFirst("赵六");
        list.addLast("孙七");
        list.push("喆喆喆喆");
        String first = list.getFirst();
        System.out.println("第一个元素："+first);
        String last = list.getLast();
        System.out.println("最后一个元素："+last);
        list.removeFirst();
        list.removeLast();
        list.pop();
        System.out.println(list.toString()+"  "+list.size());

    }

}
