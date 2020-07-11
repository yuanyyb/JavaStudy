package Test8_15;

import java.util.ArrayList;
import java.util.List;

/*有如下整数1，-2，-3，4，-5 使用Stream取元素绝对值并打印*/
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(List.of(1,-2,-3,4,-5));
        list.stream().forEach(a-> System.out.print(Math.abs(a)));
    }
}
