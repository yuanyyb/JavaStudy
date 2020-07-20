package Test8_13.Test01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作*/
public class Test01 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<String,String>();
        mp.put("1号键","1号值");
        mp.put("2号键","2号值");
        mp.put("3号键","3号值");
        mp.put("4号键","4号值");
        System.out.println(mp);
        mp.remove("1号键");
        System.out.println(mp);
        System.out.println(mp.get("2号键"));

    }
}
