package 基础语法练习.网络编程.UDP.改进后的发送接收案例;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入发送内容");
            String inpStr = sc.nextLine();
            if(inpStr=="886"){
                break;
            }
            byte[] bytes = inpStr.getBytes();
            InetAddress ia = InetAddress.getByName("yuanyongbo-SBKF");
            int port=10000;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ia,port);
            ds.send(dp);
        }
        ds.close();
    }
}
