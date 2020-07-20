package Test5_1.Test02;

public class Emloyee {
    private String name;
    private String sid;
    private double salary;

    public Emloyee() {
    }

    public Emloyee(String name, String sid, double salary) {
        this.name = name;
        this.sid = sid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("职员要工作才能有工资！");
    }
}
