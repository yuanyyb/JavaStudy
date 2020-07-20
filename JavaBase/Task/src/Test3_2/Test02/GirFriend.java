package Test3_2.Test02;

/*定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：

        ```
        我女朋友叫凤姐,身高155.0厘米,体重130.0斤
        女朋友帮我洗衣服
        女朋友给我做饭
        ```*/
public class GirFriend {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    private double height;
    public  void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    private double weight;
    public  void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public GirFriend(){}
    public GirFriend(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友帮我做饭");
    }
    public void show(){
        System.out.println("我女朋友叫"+this.name+",身高"+this.height+"厘米，体重"+this.weight+"斤");
    }

}
