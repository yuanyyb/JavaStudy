package Test2_10;
/*定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）*/

import java.util.Random;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入随机数组元素的个数");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oddNum = 0;//奇数个数
        int evenNum = 0;//偶数个数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000) + 1;
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println();
        int[] oddArr = new int[oddNum]; //奇数数组
        int[] evenArr = new int[evenNum];//偶数数组
        int[] newArr = new int[n];
        int addIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                oddArr[addIndex] = arr[i];
                System.out.print(arr[i] + " ");
                addIndex++;
            }
        }
        System.out.println();
        addIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                evenArr[addIndex] = arr[i];
                System.out.print(arr[i] + " ");
                addIndex++;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i < oddNum) {
                newArr[i] = oddArr[i];
            } else {
                newArr[i] = evenArr[i - oddNum];
            }
            System.out.print(newArr[i] + " ");
        }

    }
}
