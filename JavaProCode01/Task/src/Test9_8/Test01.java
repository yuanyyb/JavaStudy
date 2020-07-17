package Test9_8;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*后缀为properties的文件是一种属性文件，这种文件以key=value的格式存储内容，可以使用Properties类来读取这个文件，
        Properties可以保存到流中或从流中加载。已知在当前模块目录下，有一个user.properties文件（直接准备好即可），
        内容如下：
        username=heima001
        passworld=123456
        url=http://www.itheima.com
        subjectName=javaee
        请编写程序，将文件中的内容以键值对的形式存储到Properties集合中，并遍历查看结果。*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        Properties ps = new Properties();
        FileReader fr = new FileReader("Task\\src\\Test9_8\\a.properties", Charset.forName("UTF-8"));
        ps.load(fr);
        Set<Map.Entry<Object,Object>> entries = ps.entrySet();
        entries.stream().forEach(a-> System.out.println(a.getKey()+":"+a.getValue()));
        fr.close();
    }
}
