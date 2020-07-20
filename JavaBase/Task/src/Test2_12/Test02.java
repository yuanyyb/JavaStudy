package Test2_12;
/*请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。
        例如，数组为{11, 22, 33, 44, 55, 66}，交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}*/
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        changeArr(arr,1,5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void changeArr(int[] arr,int a,int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }
}
