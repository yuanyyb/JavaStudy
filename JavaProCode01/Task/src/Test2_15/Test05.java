package Test2_15;
/*有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和，
要求是：求和的元素个位和十位都不能是7，并且只能是偶数。*/
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
