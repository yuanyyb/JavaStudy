package Test4_3;
/*定义一个方法,给定一个数组，转换成一个字符串 ,例如:例如：数组为int[] arr = {1, 2, 3}，字符串为[1, 2, 3]*/
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i =0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+", ");
            }
        }
        sb.append("]");
        System.out.println("新产生的字符串为："+sb.toString());
    }
}
