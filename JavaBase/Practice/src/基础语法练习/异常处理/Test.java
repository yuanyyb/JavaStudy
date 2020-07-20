package 基础语法练习.异常处理;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("开始");
        //func(arr);
        System.out.println("请输入分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        try {
            func1(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
        System.out.println("结束");

    }
    public static void func(int[] arr) {
        try {
            arr[5] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public static void func1(int score) throws ScoreException {
        Teacher t = new Teacher();
        t.checkScore(score);
    }
}
