package Test2_10;
/*有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。要求：把数字放入数组序列中，
生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
        ```
        请输入一个整数数字：
        50
        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91*/
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int inpValue = sc.nextInt();
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] arrNew = new int[arr.length+1];
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=inpValue){
                index = i-1;
                break;
            }else if(i==arr.length-1){
                index = arr.length-1;
            }else{
                index = 0;
            }
        }
        for(int j=0;j<arrNew.length;j++){
            if(j==index+1){
                arrNew[j]=inpValue;
            }else if(j<index+1){
                arrNew[j] = arr[j];
            }else{
                arrNew[j]=arr[j-1];
            }
            System.out.print(arrNew[j]+" ");
        }

    }
}
