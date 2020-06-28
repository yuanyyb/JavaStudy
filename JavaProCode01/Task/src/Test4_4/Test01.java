package Test4_4;

import java.util.ArrayList;

/*现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。*/
public class Test01 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
