package Test5_1.Test02;

public class Coder extends Emloyee {
    public Coder() {
    }

    public Coder(String name, String sid, double salary) {
        super(name, sid, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+this.getName()+",工号为:"+this.getSid()+",工资为:"+this.getSalary()+",的程序员正在编写代码");
    }
}
