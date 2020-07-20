package 基础语法练习.教练运动员案例实现;

public class PingPangCoach extends Coach implements StudySomeThing {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃公家的，喝公家的");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球较量学英语，为了教乒乓球");
    }

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }
}
