package 基础语法练习.递归;

public class DiGui {
    public static void main(String[] args) {
        int res = getNumSum(100);
        System.out.println(res);
        res = getNumM(5);
        System.out.println(res);
    }

    private static int getNumM(int i) {
        if(i==1){
            return 1;
        }else{
            return i*getNumM(i-1);
        }
    }

    /*private static int getNumM(int i) {
        if(i==1){
            return 1;
        }else{
            return i*getNumM(i-1);
        }
    }*/

    private static int getNumSum(int i) {
        if(i==1){
            return 1;
        }else{
            return i+getNumSum(i-1);
        }
    }
    /*private static int getNumSum(int i) {
        if(i==0){
            return 0;
        }else{
            return i+getNumSum(i-1);
        }
    }*/
    /*private static int getNumM(int i){
        if(i==1){
            return 1;
        }else{
            return i*getNumM(i-1);
        }
    }*/


}
