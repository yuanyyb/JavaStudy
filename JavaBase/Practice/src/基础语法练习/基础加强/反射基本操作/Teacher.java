package 基础语法练习.基础加强.反射基本操作;

public class Teacher {
    private String name;
    private int age;


    public void teach(){
        System.out.println("老师上课！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
