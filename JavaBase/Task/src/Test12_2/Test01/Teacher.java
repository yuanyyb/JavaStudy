package Test12_2.Test01;

public class Teacher {
    private String name;
    private int age;
    public void teach(){
        System.out.println(this.getName()+"老师，"+this.getAge()+"岁，教师教书育人!");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
