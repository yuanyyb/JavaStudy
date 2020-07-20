package Test2_15;

/*已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。定义一个方法，
完成查找该数据在数组中的索引，并在控制台输出找到的索引值。*/
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入要查找的值：");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(getIndex(arr,value));
    }

    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
