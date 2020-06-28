package Test5_1.Test02;
/*结合继承的思想，分析下列需求并实现
        1.    定义项目经理类Manager 【属性：姓名 工号 工资 奖金】【行为：工作work】
        2.    定义程序员类Coder【属性：姓名 工号 工资】【行为：工作work】
        3.    要求：通过有参构造创建两个类的对象，并调用各自的work方法
        运行结果：
        姓名为:张三,工号为:9527,工资为:10000.0,的程序员正在编写代码
        姓名为:李四,工号为:9528,工资为:15000.0,奖金为:2000.0,的项目经理正在管理程序员写代码*/
public class Manager extends Emloyee {
    public Manager() {
    }
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String sid, double salary, double bonus) {
        super(name, sid, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+this.getName()+",工号为:"+this.getSid()+",工资为:"+this.getSalary()+",奖金为:"+this.getBonus()+",的项目经理正在管理程序员写代码");
    }
}
