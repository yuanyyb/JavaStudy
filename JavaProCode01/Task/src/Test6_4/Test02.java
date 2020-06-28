package Test6_4;
/*现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，例如："23,24,25"（直接定义字符串给出即可）。现需要求出这三个年龄的平均年龄，
请编写程序实现，并将结果打印到控制台。
        运行结果：
        平均年龄为：24*/
public class Test02 {
    public static void main(String[] args) {
        String s = "23,24,25,99,88,1,5,7";
        String[] arr = s.split(",");
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        int avg = sum/arr1.length;
        System.out.println("平均年龄是："+avg);
    }
}
