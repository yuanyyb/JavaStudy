package 基础语法练习.TreeSet与Comparable接口配合使用;

public class Stu {
    private String name;
    private int ChinesScore;
    private int MathScore;

    public Stu() {

    }

    public Stu(String name, int chinesScore, int mathScore) {
        this.name = name;
        ChinesScore = chinesScore;
        MathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getChinesScore() {
        return ChinesScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinesScore(int chinesScore) {
        ChinesScore = chinesScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getSumScore(){
        return this.getChinesScore()+this.getMathScore();
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", ChinesScore=" + ChinesScore +
                ", MathScore=" + MathScore +
                '}';
    }
}
