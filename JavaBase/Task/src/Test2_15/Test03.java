package Test2_15;
/*有一个很有名的数学逻辑题叫做不死神兔问题。有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？*/
/*
1 1
2 1
3 2 1+1
4 3 1+2
5 5 2+3
*/
public class Test03 {
    public static void main(String[] args) {
       int[] arr = new int[20];
       for(int i=0;i<arr.length;i++){
           if(i<=1){
               arr[i] = 1;
           }else{
               arr[i] = arr[i-2]+arr[i-1];
           }
       }
        System.out.println(arr[19]);
    }
}
