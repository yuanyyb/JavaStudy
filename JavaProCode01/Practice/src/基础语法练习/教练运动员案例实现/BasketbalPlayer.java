package 基础语法练习.教练运动员案例实现;

public class BasketbalPlayer extends Player {
    @Override
    public void play() {
        System.out.println("篮球运动员打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃鸡腿，喝可乐");
    }
}
