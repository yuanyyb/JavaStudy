package 基础语法练习.教练运动员案例实现;
/*需求：我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。为了出国交流，跟乒乓球相关的人员都需要学习英语，
     面向对象分析并测试*/
public class Test {
    public static void main(String[] args) {
        PingPangPlayer pPlayer = new PingPangPlayer();
        pPlayer.setName("王励勤");
        pPlayer.setAge(35);
        System.out.println(pPlayer.getName()+pPlayer.getAge()+"岁");
        pPlayer.eat();
        pPlayer.play();
        pPlayer.studyEnglish();
        System.out.println();

        BasketbalPlayer bPlayer = new BasketbalPlayer();
        bPlayer.setName("姚明");
        bPlayer.setAge(39);
        System.out.println(bPlayer.getName()+bPlayer.getAge()+"岁");
        bPlayer.eat();
        bPlayer.play();
        //bPlayer.studyEnglish();
        System.out.println();

        PingPangCoach pCoach = new PingPangCoach("刘国梁",25);
        System.out.println(pCoach.getName()+pCoach.getAge()+"岁");
        pCoach.eat();
        pCoach.teach();
        pCoach.studyEnglish();
        System.out.println();

        BasketbalCoach bCoach = new BasketbalCoach("啦啦啦啦",50);
        System.out.println(bCoach.getName()+bCoach.getAge()+"岁");
        bCoach.eat();
        bCoach.teach();
        //bCoach.studyEnglish();

    }
}
