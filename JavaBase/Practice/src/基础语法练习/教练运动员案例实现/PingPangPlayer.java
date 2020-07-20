package 基础语法练习.教练运动员案例实现;

public class PingPangPlayer extends Player implements StudySomeThing {
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃青菜，喝矿泉水");
    }

    @Override
    public void play() {
        System.out.println("乒乓球运动员打乒乓球");
    }
    @Override
    public void studyEnglish(){
        System.out.println("乒乓球运动员学习英语用于听教练交乒乓球");
    }
}
