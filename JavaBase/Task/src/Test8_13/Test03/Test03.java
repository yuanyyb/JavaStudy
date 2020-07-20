package Test8_13.Test03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。*/
public class Test03 {
    public static void main(String[] args) {
        Map<Car,String> mp = new HashMap<>();
        mp.put(new Car("奔驰","1.8"),"100万");
        mp.put(new Car("宝马","1.6"),"111万");
        mp.put(new Car("奥迪","2.0"),"99万");

        Set<Car> keys = mp.keySet();
        for(Car car :keys)
        {
            System.out.println(car+"----"+mp.get(car));
        }
        System.out.println("--------------------------");
        Set<Map.Entry<Car,String>> entries = mp.entrySet();
        for(Map.Entry<Car,String> carKV : entries)
        {
            System.out.println(carKV.getKey()+"----"+carKV.getValue());
        }
    }
}
