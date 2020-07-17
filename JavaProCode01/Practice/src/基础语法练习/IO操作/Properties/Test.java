package 基础语法练习.IO操作.Properties;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties ps = new Properties();
        ps.put("1","a");
        ps.put("2","b");
        ps.put("3","c");
        ps.put("4","d");
        ps.put("5","e");
        System.out.println(ps);
        ps.remove("1");
        System.out.println(ps);
        ps.put("2","cccc");
        System.out.println(ps);
        Set<Object> s = ps.keySet();
        for(Object k :s){
            System.out.println(k+":"+ps.get(k));
        }

        Set<Map.Entry<Object,Object>> entries = ps.entrySet();
        for(Map.Entry<Object,Object> entry :entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("-------Properties特殊方法--------");
        ps.setProperty("6","f");
        System.out.println(ps);
        Object val = ps.getProperty("4");
        System.out.println(val);
        Set<String> keys = ps.stringPropertyNames();
        keys.stream().forEach(a-> System.out.println(a));
        System.out.println("----------load和store方法读写properties文件---------");

        Properties ps1 = new Properties();
        //FileInputStream is = new FileInputStream("Practice\\src\\基础语法练习\\IO操作\\Properties\\aaa.properties");
        FileReader fr = new FileReader("Practice\\src\\基础语法练习\\IO操作\\Properties\\aaa.properties", Charset.forName("UTF-8"));
        ps1.load(fr);
        System.out.println(ps1);
        fr.close();
        ps1.put("eee","新增加的内容写入");
        FileWriter fw = new FileWriter("Practice\\src\\基础语法练习\\IO操作\\Properties\\aaa.properties",Charset.forName("UTF-8"));
        ps1.store(fw,null);
        fw.close();


    }
}
