package 基础语法练习.基础加强.类加载器;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//用类加载器加载一个properties资源文件
public class properties资源文件加载基本操作 {
    public static void main(String[] args) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FileReader is = new FileReader("Practice\\src\\基础语法练习\\基础加强\\类加载器\\pop.properties", Charset.forName("GBK"));
        Properties properties = new Properties();
        properties.load(is);
        System.out.println(properties);
        Set<Map.Entry<Object,Object>> s = properties.entrySet();
        Iterator<Map.Entry<Object,Object>> iterator = s.iterator();
        while(iterator.hasNext()){
            Map.Entry<Object,Object> ks = iterator.next();
            System.out.println(ks.getKey()+"---"+ks.getValue());
        }
    }
}
