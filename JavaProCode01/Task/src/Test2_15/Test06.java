package Test2_15;

/*设计一个方法，用于比较两个数组的内容是否相同。*/
public class Test06 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 3, 4, 5, 6, 8};
        System.out.println(compare(arr1,arr2));
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
