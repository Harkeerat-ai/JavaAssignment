import java.net.*;
import java.util.Scanner;

public class Q2_UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");
        Scanner sc = new Scanner(System.in);

        while (true) {
            // type a message and send it to the server
            System.out.print("Enter message: ");
            String msg = sc.nextLine();
            byte[] data = msg.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(data, data.length, ip, 5001);
            ds.send(sendPacket);

            // receive the reply from server
            byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            ds.receive(receivePacket);
            String reply = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server: " + reply);
        }
    }
}
