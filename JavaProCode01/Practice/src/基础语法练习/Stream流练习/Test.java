package 基础语法练习.Stream流练习;
/*现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
        男演员只要名字为3个字的前三人 女演员只要姓林的，并且不要第一个
        把过滤后的男演员姓名和女演员姓名合并到一起
        把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrMan = new ArrayList<>();
        arrMan.add("王二狗");
        arrMan.add("李四");
        arrMan.add("张麻子");
        arrMan.add("王二蛋");
        arrMan.add("隔壁老王");
        arrMan.add("苟狗狗");

        ArrayList<String> arrWom = new ArrayList<>();
        arrWom.add("林黛玉");
        arrWom.add("林妹妹");
        arrWom.add("赵丽颖");
        arrWom.add("招照照");
        arrWom.add("你好");
        arrWom.add("豆豆");

        List<String> newArrMan = arrMan.stream().filter(a->a.length()==3).limit(3).collect(Collectors.toList());
        List<String> newArrWom = arrWom.stream().filter(a->a.startsWith("林")).skip(1).collect(Collectors.toList());
        Stream.concat(newArrMan.stream(),newArrWom.stream()).forEach(a-> System.out.println(new Actor(a)));

    }


}
