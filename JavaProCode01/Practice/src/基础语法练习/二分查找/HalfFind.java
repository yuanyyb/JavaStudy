package 基础语法练习.二分查找;

public class HalfFind {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,99,100,811,999,1000,1001};
        int a = 1000;
        int res =findNum(arr,a);
        System.out.println(res);
    }

    private static int findNum(int[] arr, int a) {
        int min = 0;
        int max= arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(a>arr[mid]){
                min = mid+1;
            }else if(a<arr[mid]){
                max = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    /*public static int findNum(int[] arr,int a) {
        int max = arr.length-1;
        int min = 0;
        while(min<=max){
            int mid = (min+max)/2;
            if(a<arr[mid]){
                max = mid-1;
            }else if(a>arr[mid]){
                min = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }*/
}
