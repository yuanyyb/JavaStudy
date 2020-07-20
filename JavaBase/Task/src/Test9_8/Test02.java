package Test9_8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;

/*描述:
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        Properties ps = new Properties();
        FileReader fr = new FileReader("Task\\src\\Test9_8\\score.txt", Charset.forName("UTF-8"));
        ps.load(fr);
        if(ps.containsKey("lisi")){
            ps.put("lisi","100");
        }
        fr.close();
        System.out.println(ps);
        FileWriter fw = new FileWriter("Task\\src\\Test9_8\\score.txt",Charset.forName("UTF-8"));
        ps.store(fw,null);
        fw.close();
    }
}
