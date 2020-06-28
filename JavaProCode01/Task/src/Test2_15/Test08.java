package Test2_15;
/*已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值反转
(在原数组中操作，不能定义第二个数组)，反转后的数组 arr = {50, 46, 37, 28, 19};
并在控制台输出反转后的数组元素。*/
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[] arr) {
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }
    }
}
