package Test10_1.Test04;

public class Test {
    public static void main(String[] args) {
        ThreadLei1 tl1 = new ThreadLei1();
        tl1.start();
        System.out.println(tl1.getName());

        ThreadLei2 tl2 = new ThreadLei2();
        Thread tr = new Thread(tl2);
        tr.start();
        System.out.println(tr.getName());
    }
}
