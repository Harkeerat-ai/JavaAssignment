import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q1_ArmstrongClient {
    public static void main(String[] args) throws Exception {
        // connect to the server running on same computer
        Socket s = new Socket("localhost", 5000);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        // take number from user and send it to server
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        out.writeInt(num);

        // read the reply from server
        String reply = in.readUTF();
        System.out.println("Server says: " + reply);

        s.close();
    }
}
