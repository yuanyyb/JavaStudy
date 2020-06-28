package Test7_1;

public class Student {
    public void checkScore(int score) throws ScoreException{
        if(score<0){
            throw new ScoreException("分数不能为负数！");
        }else{
            System.out.println("输入分数正常");
        }
    }
}
