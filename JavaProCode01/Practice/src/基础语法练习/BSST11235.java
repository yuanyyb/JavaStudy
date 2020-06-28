package 基础语法练习;

public class BSST11235 {
    public static void main(String[] args) {
        //一对兔子从第三个月开始：每月能生一对兔子，问第20个月有多少对兔子
        //1 1
        //2 1
        //3 2 1+1
        //4 3 1+2
        //5 5 2+3
        //6 8 3+5
        int[] arr = new int[20];
        for(int i=0;i<20;i++){
            if(i<=1){
                arr[i]=1;
            }else{
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        System.out.println(arr[19]);
    }
}
