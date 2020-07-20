package Test4_4.Test02;

import java.util.ArrayList;

/*请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
        姓名：赵老师, 专业：javase
        姓名：钱老师, 专业：javaee
        姓名：孙老师, 专业：php
        姓名：李老师, 专业：python*/
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setMajor("语文");
        Teacher t2 = new Teacher();
        t2.setName("李四");
        t2.setMajor("体育");
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        list.add(t1);
        list.add(t2);
        for(int i = 0;i<list.size();i++){
            System.out.println("姓名："+list.get(i).getName()+",专业："+list.get(i).getMajor());
        }
    }
}
