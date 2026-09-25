import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q1_ArmstrongClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        System.out.print("Enter number: ");
        new DataOutputStream(s.getOutputStream()).writeInt(new Scanner(System.in).nextInt());
        System.out.println(new DataInputStream(s.getInputStream()).readUTF());
        s.close();
    }
}
