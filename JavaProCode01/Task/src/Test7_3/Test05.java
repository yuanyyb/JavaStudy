package Test7_3;
/*定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。*/
import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,6,6,6};
        List<Integer> list = listTest(arr);
        System.out.println(list);
    }

    public static List<Integer> listTest(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
