package Test12_2.Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*在当前模块目录下有properties格式的配置文件（直接准备好即可），内容如下：
className=com.itheima.Teacher
methodName=teach
同时，在com.itheima包下定义标准的JavaBean，名为Teacher，提供teach方法（无参无返回值，自定义即可）。
请读取该配置文件，使用反射技术，加载这个类，并运行配置的方法。*/
public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties config = new Properties();
        FileInputStream fis = new FileInputStream("Task\\src\\Test12_2\\Test01\\config.properties");
        config.load(fis);
        String className = (String) config.get("className");
        String method = (String) config.get("methodName");
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        Teacher teacher = (Teacher) constructor.newInstance("张三",29);
        Method methodObj = clazz.getDeclaredMethod(method);
        methodObj.invoke(teacher);

    }
}
