package Test2_10;

import java.util.Random;

/*有一个整数数组。请编写代码，让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推。最终得到一个大的整数。比如：
```
原数组：{1,2,3,4,5}
最终得到的结果： 12345*/
public class Test04 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.println("第" + (i + 1) + "个数是：" + arr[i]);
        }
        int num = 0;
        for (int j = 0; j < arr.length; j++) {
            int cj = 1;
            for (int i = 1; i < arr.length - j; i++) {
                if (j != arr.length - 1) {
                    cj *= 10;
                } else {
                    cj *= 1;
                }
            }
            num +=arr[j]*cj;
        }
        System.out.println("组成的整数值为："+num);
    }
}
