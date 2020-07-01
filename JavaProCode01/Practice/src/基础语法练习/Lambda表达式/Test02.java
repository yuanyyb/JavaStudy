package 基础语法练习.Lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i2.compareTo(i1);
//            }
//        });

        Arrays.sort(arr,(i1,i2)->i2.compareTo(i1));

        System.out.println(Arrays.toString(arr));
    }
}
