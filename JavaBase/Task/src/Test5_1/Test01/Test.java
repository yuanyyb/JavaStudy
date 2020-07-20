package Test5_1.Test01;

public class Test {
    public static void main(String[] args) {
        BaseTeacher t1 = new BaseTeacher("张三",23);
        System.out.println(t1.getName()+"老师，"+t1.getAge()+"岁");
        t1.teach();
        WorkTeacher t2 = new WorkTeacher("里斯",29);
        System.out.println(t2.getName()+"老师，"+t2.getAge()+"岁");
        t2.teach();
    }
}
