package 基础语法练习.异常处理;

public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if(score<0||score>100){
            throw new ScoreException("输入分数正常范围应在0~100");
        }else{
            System.out.println("分数正常");
        }
    }
}
