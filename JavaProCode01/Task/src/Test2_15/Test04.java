package Test2_15;
/*?    我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，
     鸡雏三值钱一。
?    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？*/
/*
0<=x<=20
0<=y<=33
0<z<100;
5x+3y+z/3=100
*/
public class Test04 {
    public static void main(String[] args) {
        for(int x=0;x<=20;x++){
            for(int y=0;y<=30;y++){
                double z=100-x-y;
                if(5*x+3*y+z/3==100&&z*10%10==0){
                    System.out.println("鸡翁："+x+" 鸡母："+y+" 鸡雏："+(int)z);
                }
            }
        }
    }
}
