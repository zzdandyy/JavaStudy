package day6.study6;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "hello UDP,我来了".getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getByName("192.168.137.1");

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, 10086);
        ds.send(dp);

        ds.close();
    }
}
