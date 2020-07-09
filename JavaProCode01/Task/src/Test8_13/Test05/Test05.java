package Test8_13.Test05;

import java.util.HashMap;
import java.util.Map;

/*有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}*/
public class Test05 {
    public static void main(String[] args) {
        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> mp = new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            mp.put(arr1[i],arr2[i]);
        }
        mp.forEach((k,v)->{
            System.out.print(k+"="+v+", ");
        });
    }
}
