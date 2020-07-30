package 基础语法练习.基础加强.反射基本操作;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        1.获取字节码类对象：
//        1)静态方法forName("完整路径类名");
        Class c = Class.forName("基础语法练习.基础加强.反射基本操作.Student");
//        2)class属性名获取
//        Class c1 = Student.class;
//        3)对象getClass()方法获取
//        Student s = new Student();
//        Class c2 = s.getClass();
//
//        2.获取构造方法：
//        1)获取所有“公共”的构造方法:
//        Constructor[] constructors = c.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }
//        2)获取所有构造方法（private和public）：
//        Constructor[] constructors = c.getDeclaredConstructors();
//        3)获取单个构造方法
//        Constructor constructor = c.getConstructor(String.class,int.class);
//        System.out.println(constructor);
//        4)可以获取到司有的构造方法
//        Constructor constructor = c.getDeclaredConstructor(String.class,int.class);

//        3.利用构造方法创建对象
//        1)
//        Constructor constructor = c.getDeclaredConstructor(String.class,int.class);
//        Student stu = (Student) constructor.newInstance("张三",10);
//        System.out.println(stu);
//        2)
//        c.newInstance();//此处直接返回具体类的对象，不是object
//        3)
//        Constructor constructor = c.getDeclaredConstructor(String.class);
//        constructor.setAccessible(true);//私有构造方法,临时关闭检查，强行使用
//        Student stu = (Student) constructor.newInstance("张三");//此处创建的是Object类型对象,需要强转
//        System.out.println(stu);

//        4.获取成员变量
//        Field[] fields = c.getFields();//public可被获取
//        Field[] fields1 = c.getDeclaredFields();//private public都可获取
//        Field field = c.getField("desc");//获取public修饰
//        Field field1 = c.getDeclaredField("name");//可获取private修饰的
//        //field.set("a");
//        System.out.println(field1);

        //5.给对象的属性赋值
//        Constructor constructor = c.getConstructor(String.class,int.class);
//        Student stu = (Student) constructor.newInstance("张三",10);
//        System.out.println(stu);
//        Field field = c.getField("desc");//获取public修饰
//        field.set(stu,"描述内容");//设置变量值
//        String value = (String) field.get(stu);//获取变量值
//        System.out.println(stu);
//        System.out.println(field.get(stu));
        //6.获取方法
//        Method[] funs = c.getMethods();//获取所有方法包括从父类继承的方法
//        Method[] funs1 = c.getDeclaredMethods();//获取所有当前类中的方法，不包含从父类继承的方法
//        Method fun =c.getMethod("study");//根据方法名和参数类型获取方法，可获取public
//        Method fun1 = c.getDeclaredMethod("pStudy");//根据方法名和参数获取方法可获取private public修饰


        //7.调用方法
//        Method fun1 = c.getDeclaredMethod("pStudy");
//        Method fun2 = c.getMethod("getSum", int.class, int.class);
//        Constructor constructor = c.getConstructor(String.class,int.class);
//        Student stu = (Student) constructor.newInstance("李四",10);
//        //fun1.setAccessible(true);//如果强制调用私有方法需要临时关闭检查
//        //fun1.invoke(stu);
//        Object res =fun2.invoke(stu, 1, 2);
//        System.out.println(res);

    }
}
