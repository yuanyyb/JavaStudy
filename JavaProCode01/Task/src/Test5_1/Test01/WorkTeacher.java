package Test5_1.Test01;

public class WorkTeacher extends Teacher {
    @Override
    public void teach(){
        System.out.println("就业班老师讲JavaEE");
    }

    public WorkTeacher() {
    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }
}
