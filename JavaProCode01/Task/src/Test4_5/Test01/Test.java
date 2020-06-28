package Test4_5.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Worker> list = new ArrayList<Worker>();
        int i=1;
        while(true){
            System.out.println("请输入第"+i+"个工人姓名：");
            String name = sc.nextLine();
            System.out.println("请输入第"+i+"个工人工龄：");
            String year = sc.nextLine();
            Worker w = new Worker(name,year);
            list.add(w);
            System.out.println("结束输入，并查看已录入工人信息请输入end");
            String isEnd = sc.nextLine();
            if(isEnd.equals("end")){
                for(int j=0;j<list.size();j++){
                    System.out.println("姓名："+list.get(j).getName()+"\t工龄："+list.get(j).getYear());
                }
                break;
            }
            i++;
        }

    }
}
