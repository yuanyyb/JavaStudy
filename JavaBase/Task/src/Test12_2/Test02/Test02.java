package Test12_2.Test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*有如下学生实体类：
请编写一个方法setProperty，该方法可以接收三个参数，第一个为Object类型的obj对象，
第二个为String类型的propertyName，第三个为Object类型的value，方法的作用是能够为obj对象中
名为propertyName的属性的值设置为value。在主方法中调用方法进行测试。*/
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class c = Class.forName("Test12_2.Test02.Student");
//        Constructor constructor = c.getDeclaredConstructor(String.class,int.class);
//        Object student = constructor.newInstance("张三",19);
//        Method method = c.getDeclaredMethod("showInfo");
//        method.invoke(student);
//        setProperty(student,"age",10);
//        method.invoke(student);

        Student student = new Student("张三",100);
        student.showInfo();
        setProperty(student,"age",10);
        student.showInfo();
    }
    static void setProperty(Object obj, String propertyName, Object value) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class c = obj.getClass();
        Field field = c.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,value);
    }
}
