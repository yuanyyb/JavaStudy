package 基础语法练习.学生管理控制台系统;

public class Student {
    private String name;
    private String age;
    private String sid;
    private String address;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSid() {
        return sid;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(String name, String age, String sid, String address) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
    }
}
