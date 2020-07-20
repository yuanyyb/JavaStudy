package Test5_4.Test02;

public class Outer {
    public static Inter method(){
        return new Inter(){
            @Override
            public void show(){
                System.out.println("HelloWorld");
            }
        };
    }
}
