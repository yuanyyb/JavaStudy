package Test3_2.Test01;
import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");
        phone.call();
        phone.sendMessage();

        Phone p = new Phone("小米",3998,"黑色");
        p.call();
        p.sendMessage();

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

    }
}
