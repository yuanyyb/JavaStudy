package Test7_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*定义一个方法listTest(ArrayList<Integer> al, Integer s)，
要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/
public class Test06 {
    public static void main(String[] args) {
        ArrayList c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(4);
        c.add(6);
        c.add(4);
        int size = c.size();
        /*Object[] arr = new Object[size];
        Iterator<Integer> it = c.iterator();
        for(int i=0;i<size;i++){
            if(it.hasNext()) {
                arr[i] = it.next();
            }
        }*/
        System.out.println(listTest(c,4));
    }
    public static int listTest(ArrayList<Integer> al, Integer s){
        /*Object[] arr = al.toArray();
        for(int i = 0;i<arr.length;i++){
            if((Integer)arr[i] == s){
                return i;
            }
        }*/

        /*Iterator<Integer> it = al.iterator();
        int i=0;
        while(it.hasNext()){
            Integer v = it.next();
            if(v==s){
                return i;
            }
            i++;
        }*/

        for(int i=0;i<al.size();i++){
            if(al.get(i)==s){
                return i;
            }
        }
        return -1;
    }


}
