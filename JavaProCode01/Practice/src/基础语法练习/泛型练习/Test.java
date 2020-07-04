package 基础语法练习.泛型练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Generic<Integer> o = new Generic<Integer>();
        o.setT(6);
        o.show("dd");
        System.out.println("1111111");
        System.out.println('s');

        FXClass<String> fxl = new FXClass<String>();
        //1.
        fxl.setElement("泛型类");//使用泛型类
        //2.
        fxl.show("泛型方法");//使用泛型接口
        //3.1
        FxjkTest1<String> ifxjk1 = new FxjkTest1<String>();//第一种泛型接口使用方式(实现接口类定义为泛型且实现接口也是泛型)
        ifxjk1.show("那么");
        //3.2
        FxjkTest2 ifxjk2 = new FxjkTest2();//第二种泛型接口的使用方式（实现接口类定义为普通类,实现接口给定具体类型）
        ifxjk2.show(100);

        //4.1泛型通配符？调用方法传参时的基本使用
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Object> list3 = new ArrayList<Object>();
        printListFun1(list1);
        printListFun1(list2);
        //4.2表示参数范围
        printListFun21(list2);
        printListFun22(list3);

    }
    //此时传入的list都可以传入
    private static void printListFun1(ArrayList<?> list) {
        System.out.println(list);
    }
    //表示传入的参数集合类型可以时Number或者Number的子类
    private static void printListFun21(ArrayList<?extends Number> list) {
        System.out.println(list);
    }
    //表示传入的参数集合类型可以时Number或者Number的父类
    private static void printListFun22(ArrayList<?super Number> list) {
        System.out.println(list);
    }
}
//泛型类
class FXClass<T>{
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public<T> void show(T t){
        System.out.println(this.getElement());
        System.out.println(t);
    }
}
//泛型接口
interface IFXJiekou<T>{
    void show(T t);
}
//泛型接口的实现类
class FxjkTest1<T> implements IFXJiekou<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

class FxjkTest2 implements IFXJiekou<Integer>{
    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }
}

//