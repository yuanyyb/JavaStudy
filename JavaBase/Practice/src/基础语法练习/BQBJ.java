package 基础语法练习;
/*百钱百鸡：公鸡5文，母鸡3文，小鸡：1文3只 100文钱买了100只鸡，问公鸡 母鸡 小鸡各多少只*/
public class BQBJ {
    public static void main(String[] args) {
        //声明公鸡 x ,母鸡y ,小鸡z
        //公鸡 0<=x<20;
        //母鸡 0<=y<=33;
        //小鸡 z = 100-x-y;
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z= 100-x-y;
                if(z%3==0&&x*5+y*3+z/3==100){
                    System.out.println("公鸡："+x+" 母鸡："+y+" 小鸡"+z);
                }
            }
        }
    }

}
