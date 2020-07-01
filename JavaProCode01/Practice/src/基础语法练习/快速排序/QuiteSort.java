package 基础语法练习.快速排序;

public class QuiteSort {
    public static void main(String[] args) {
        int[] arr = {6,2,5,8,3,4,1,10,7,9};
        quiteArr(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quiteArr(int[] arr, int left, int right) {
        if(left>right){
            return;
        }
        int left0 = left;
        int right0 = right;
        int baseNum = arr[left0];
        while(left!=right){
            while(arr[right]>=baseNum&&left<right){
                right--;
            }
            while(arr[left]<=baseNum&&left<right){
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int tp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = tp;
        quiteArr(arr,left0,left-1);
        quiteArr(arr,left+1,right0);
    }

    /*private static void quiteArr(int[] arr, int left, int right) {
        if(left>right){
            return;
        }
        int left0 = left;
        int right0 = right;
        int baseNum = arr[left0];
        while(left!=right){
            while(arr[right]>=baseNum&&left<right){
                right--;
            }
            while(arr[left]<=baseNum&&left<right){
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int tp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = tp;
        quiteArr(arr,left0,left-1);
        quiteArr(arr,left+1,right0);
    }*/

    /*private static void quiteArr(int[] arr, int left, int right) {
        if(left>right){
            return;
        }
        int left0=left;
        int rigth0 = right;
        int baseNum=arr[left0];
        while(left!=right){
            while(arr[right]>=baseNum && left<right){
                right--;
            }
            while(arr[left]<=baseNum && left<right){
                left++;
            }
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
        }
        int tp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = tp;
        quiteArr(arr,left0,left-1);
        quiteArr(arr,right+1,rigth0);

    }*/



}
