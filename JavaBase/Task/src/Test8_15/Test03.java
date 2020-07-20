package Test8_15;

/*已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
        1、取出前2个元素并在控制台打印输出。
        2、取出后2个元素并在控制台打印输出。*/


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(List.of("陈玄风","梅超风","陆乘风","曲灵风","武眠风","冯默风","罗玉风")) ;
        //nameList.forEach(a-> System.out.println(a));
        nameList.stream().limit(2).collect(Collectors.toList()).stream().forEach(a-> System.out.println(a));
        System.out.println("=======");
        nameList.stream().skip(nameList.size()-2).collect(Collectors.toList()).stream().forEach(a-> System.out.println(a));
    }
}
