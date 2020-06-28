package Test6_1;
        /*给定一个数组int[] arr={2,3,-7,-9,0}; 将数组中所有的数据都变成正数.
        训练目标:
        Math类常用方法
        训练提示:
        都变成正数,要用到Math.abs()方法求绝对值*/

public class Test02 {
    public static void main(String[] args) {
        int[] arr={2,3,-7,-9,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i] = Math.abs(arr[i]);
            }
            System.out.print(arr[i]+" ");
        }
    }
}
