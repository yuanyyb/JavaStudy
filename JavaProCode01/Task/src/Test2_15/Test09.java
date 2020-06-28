package Test2_15;
/*在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。*/
import java.util.Scanner;
public class Test09 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数：");
            arr[i]=sc.nextInt();
        }
        System.out.println("平均分："+getAvg(arr));
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        int max = arr[1];
        int min= arr[1];
        int avg =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum+=arr[i];
        }
        avg = (sum - max-min)/(arr.length-2);
        return avg;
    }
}
