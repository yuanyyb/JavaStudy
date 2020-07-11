package Test9_1.Test02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        //检查Task下是否有Test9_1_02.txt
        File file = new File("Task");
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        hasFile(file,list);

        if(list.get(0).equals("")){
            File file1 = new File(file,"src\\Test9_1\\Test02\\Test9_1_02.txt");
            file1.createNewFile();
        }else{
            System.out.println(list.get(0));
        }
    }

    private static void hasFile(File file,ArrayList<String> list) {
        File[] files = file.listFiles();
        for(File f :files){
            if(f.isFile()){
                String name = f.getName();
                if(name.equals("Test9_1_02.txt")){
                    list.set(0,f.getAbsolutePath());
                }
            }else{
                hasFile(f,list);
            }
        }
    }
}
