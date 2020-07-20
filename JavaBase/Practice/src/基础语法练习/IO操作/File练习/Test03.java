package 基础语法练习.IO操作.File练习;

import java.io.File;
import java.util.HashMap;

//统计一个文件夹中每种文件的个数
public class Test03 {
    public static void main(String[] args) {
        File file = new File("Practice\\src\\基础语法练习\\IO操作\\File练习");
//        HashMap<String,Integer> hm = new HashMap<String,Integer>();
//        getAllFile(file,hm);
//        System.out.println(hm);
        System.out.println(file.getAbsolutePath());
    }

    private static void getAllFile(File file, HashMap<String,Integer> hm) {
        File[] files = file.listFiles();
        for(File f :files){
            if(f.isFile()){
                String fname = f.getName();
                String[] fnameArr = fname.split("\\.");
                if(fnameArr.length==2) {
                    String fextendName = fnameArr[1];
                    if (hm.containsKey(fextendName)) {
                        Integer count = hm.get(fextendName);
                        count++;
                        hm.put(fextendName, count);
                    } else {
                        hm.put(fextendName, 1);
                    }
                }
            }else{
                getAllFile(f,hm);
            }
        }
    }
}
