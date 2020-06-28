package Test7_1;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("请输入分数");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        try {
            s.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
