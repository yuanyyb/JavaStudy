package 基础语法练习;

public class Test {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //冒泡排序
        int[] arr = {1, 6, 3, 8, 111, 9, 10};
        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i < arr.length - 1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
        Integer i2 = Integer.valueOf("10000");
        System.out.println(i2);
        Integer i3 = Integer.valueOf("999a");//报错：NumberFormatException
        System.out.println(i3);


    }
}
