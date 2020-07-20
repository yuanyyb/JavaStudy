package Test8_5;

import java.util.Arrays;

/*题目一
        编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素

        训练目标:

        考察泛型的使用

        训练提示:

        1.在main方法里定义一个引用类型 数组,存放数据,例如: Integer[] a = {1,2,3,4,5,6};

        2.定义泛型方法,参数类型用泛型定义

        3.泛型方法里进行数组反转

        4.在main方法里,调用泛型方法

        5.打印数组值*/
public class Test01 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        String[] arrStr = {"你好","骚年","你好吗","少年"};
        listTest(arr);
        listTest(arrStr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrStr));
    }
    public static <T> void listTest(T[] arr){
        for(int i=0;i<arr.length;i++){
            if(i<arr.length/2){
                T temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        }
    }
}
