package 基础语法练习.教练运动员案例实现;

public class BasketbalCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃香的喝辣的");
    }

    public BasketbalCoach() {
    }

    public BasketbalCoach(String name, int age) {
        super(name, age);
    }
}
