package 基础语法练习.TreeMap集合练习.Test02;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


/*给定一个字符串,要求统计字符串中每个字符出现的次数。
举例: 给定字符串是“aababcabcdabcde”,在控制台输出: “a(5)b(4)c(3)d(2)e(1)”*/
public class Test02 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";
        /*TreeMap<String,Integer> tm = new TreeMap<>();
        String[] arrs = s.split("");
        for(int i=0;i<arrs.length;i++)
        {
            if(tm.containsKey(arrs[i])){
                Integer count = tm.get(arrs[i]);
                tm.put(arrs[i],count+1);
            }else {
                tm.put(arrs[i], 1);
            }
        }
        tm.forEach((k,v)->{
            System.out.print(k+"("+v+")");
        });*/
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                tm.put(c,1);
            }
        }
        tm.forEach((k,v)->{
            System.out.print(k+"("+v+")");
        });
        Map<String,String> tm1 = Map.of("a","b");
        Map<String,String> tm2 = Map.ofEntries(Map.entry("a","b"),Map.entry("a","b"),Map.entry("a","b"));
    }
}
