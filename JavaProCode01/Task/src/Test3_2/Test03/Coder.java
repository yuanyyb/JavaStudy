package Test3_2.Test03;

public class Coder {
        private String name;
        public void setName(String name){
            this.name = name;
        }
        public String getName(String name){
            return this.name;
        }
        private int id;
        public void setId(int id){
            this.id = id;
        }
        public int getId(String id){
            return this.id;
        }
        private int salary;
        public void setSalary(int salary){
            this.salary = salary;
        }
        public int getSalary(int salary){
            return this.salary;
        }
        public Coder(){}
        public Coder(String name,int id,int salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        public void work(){
            System.out.println("工号为"+this.id+"基本工资为"+this.salary+"的程序员正在努力的写着代码......");
        }
}
