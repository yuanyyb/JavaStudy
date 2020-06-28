package Test2_11;
/*请定义一个方法，该方法可以实现对int类型的数组进行遍历，在控制台打印所有元素。实现方法后，请在主方法中调用方法，查看结果。*/
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {11111,222,534,667,222};
        ForeachArr(arr);
    }

    public static void ForeachArr(int[] arr) {
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1) {
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");

    }
}
