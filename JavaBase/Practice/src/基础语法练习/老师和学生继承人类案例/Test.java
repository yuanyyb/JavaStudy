package 基础语法练习.老师和学生继承人类案例;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("张老师");
        t1.setAge(23);
        System.out.println(t1.getName()+","+t1.getAge()+"岁");
        t1.teach();
        t1.doSomeThing();

        Teacher t2 = new Teacher("李老师",35);
        System.out.println(t2.getName()+","+t2.getAge()+"岁");
        t2.teach();
        t2.doSomeThing();

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(17);
        System.out.println(s1.getName()+","+s1.getAge()+"岁");
        s1.study();
        s1.doSomeThing();

        Student s2 = new Student("里斯",19);
        System.out.println(s2.getName()+","+s2.getAge()+"岁");
        s2.study();
        s2.doSomeThing();
        s2.doSomeThing("");
    }

}
