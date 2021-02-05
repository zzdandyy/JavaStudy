package day06.study6;


import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("zzd");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(ip + "," + name);
    }
}