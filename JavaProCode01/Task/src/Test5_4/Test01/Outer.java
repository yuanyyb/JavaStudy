package Test5_4.Test01;

class Outer {
    int num = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            // ---完善代码---
            System.out.println(num);       // 输出30
            System.out.println(this.num);       // 输出20
            System.out.println(new Outer().num);       // 输出10
        }
    }
}
