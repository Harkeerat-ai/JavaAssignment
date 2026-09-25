import java.net.*;
import java.util.Scanner;

public class Q2_UDPServer {
    public static void main(String[] args) throws Exception {
        // server socket on port 5001
        DatagramSocket ds = new DatagramSocket(5001);
        Scanner sc = new Scanner(System.in);
        System.out.println("UDP Server started, waiting for client...");

        while (true) {
            // receive message from client
            byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            ds.receive(receivePacket);
            String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client: " + msg);

            // type a reply and send it back to the client
            System.out.print("Enter reply: ");
            String reply = sc.nextLine();
            byte[] data = reply.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(data, data.length,
                    receivePacket.getAddress(), receivePacket.getPort());
            ds.send(sendPacket);
        }
    }
}
