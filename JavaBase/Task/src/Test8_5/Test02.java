package Test8_5;

import java.util.Arrays;

/*编写一个泛型方法，实现任意引用类型数组指定位置元素交换。

        训练目标:

        考察泛型的使用

        训练提示:

        1.在main方法里定义一个引用类型 数组,存放数据,例如: Integer[] a = {1,2,3,4,5,6};

        2.定义泛型方法

        3.泛型方法里进行元素交换

        4.在main方法里,调用泛型方法

        5.打印数组值*/
public class Test02 {
    public static void main(String[] args) {
        Integer[] arr = {0,1,2,3,4,5,6,7};
        listTest(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }

    private static<T>void listTest(T[] arr, int x, int y) {
        if(x<arr.length-1&&y<arr.length-1){
            T temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }else{
            System.out.println("索引越界");
        }
    }

}
