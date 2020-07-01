package 基础语法练习.冒泡排序;

public class MPSort {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,8,0,1,22,555,9};
        getSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private static void getSort(int[] arr) {
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1 -x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    /*private static void getSort(int[] arr) {
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1-x;i++){
                if(arr[i]<=arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }*/
}
