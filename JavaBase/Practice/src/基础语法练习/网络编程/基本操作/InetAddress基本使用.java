package 基础语法练习.网络编程.基本操作;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress基本使用 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("yuanyongbo-SBKF");//InetAddress.getLocalHost();
        String hostName = ia.getHostName();
        String hostAddress = ia.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
