package Test8_2;

import java.util.ArrayList;

/*定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/
public class Test06 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(0);
        Integer s = 0;
        int res = listTest(al,s);
        System.out.println(res);
    }

    private static int listTest(ArrayList<Integer> al, Integer s) {
        for(int i=0;i<al.size();i++){
            if(al.get(i)==s){
                return i;
            }
        }
        return -1;
    }
}
