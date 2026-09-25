import java.net.*;
import java.util.Scanner;

// Run "java Q2_UDPChat" for server, "java Q2_UDPChat client" for client
public class Q2_UDPChat {
    static void send(DatagramSocket s, String m, InetAddress ip, int port) throws Exception {
        s.send(new DatagramPacket(m.getBytes(), m.length(), ip, port));
    }

    static DatagramPacket recv(DatagramSocket s) throws Exception {
        DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
        s.receive(p);
        return p;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (args.length == 0) {
            DatagramSocket s = new DatagramSocket(5001);
            System.out.println("Server waiting...");
            while (true) {
                DatagramPacket p = recv(s);
                System.out.println("Client: " + new String(p.getData(), 0, p.getLength()));
                System.out.print("Reply: ");
                send(s, sc.nextLine(), p.getAddress(), p.getPort());
            }
        } else {
            DatagramSocket s = new DatagramSocket();
            while (true) {
                System.out.print("Message: ");
                send(s, sc.nextLine(), InetAddress.getLocalHost(), 5001);
                DatagramPacket p = recv(s);
                System.out.println("Server: " + new String(p.getData(), 0, p.getLength()));
            }
        }
    }
}
