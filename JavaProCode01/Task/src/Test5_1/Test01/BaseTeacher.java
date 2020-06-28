package Test5_1.Test01;

public class BaseTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("基础班老师讲JavaSE");
    }

    public BaseTeacher() {
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }
}
