package Test8_15;

import Test5_3.Test01.Inter;

import java.util.Arrays;
import java.util.function.Predicate;

/*1.    请在测试类main方法中完成以下需求
已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
a)    使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
b)    使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
c)    使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数

    遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
i.    打印自然数的个数
ii.    打印负整数的个数
iii.    打印绝对值大于100的偶数的个数
iv.    打印是负整数或偶数的数的个数*/
public class Test01 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};

        Predicate<Integer> p1 = a->a>=0;
        Predicate<Integer> p2 = a->Math.abs(a)>100;
        Predicate<Integer> p3 = a->a%2==0;
        int c1 = 0;
        int c2 = 0;
        int c3=0;
        int c4=0;
        for (int i = 0; i < arr.length; i++) {
            if(p1.test(arr[i])){
                c1++;
            }
            if(p1.negate().test(arr[i]))
            {
                c2++;
            }
            if(p2.and(p3).test(arr[i])){
                c3++;
            }
            if(p3.or(p1.negate()).test(arr[i])){
                c4++;
            }
        }
        System.out.println("自然数的个数"+c1);
        System.out.println("负整数的个数"+c2);
        System.out.println("绝对值大于100的偶数的个数"+c3);
        System.out.println("负整数或偶数的数的个数"+c4);

    }
}
