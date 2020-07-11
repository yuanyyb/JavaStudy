package Test9_1.Test03;

import java.io.File;

/*描述:在D盘下创建一个名为bbb的文件夹。*/
public class Test03 {
    public static void main(String[] args) {
        File file = new File("Task\\src\\Test9_1\\Test03\\bbb");
        if(!file.exists()){
            file.mkdirs();
        }

    }
}
