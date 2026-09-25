import java.io.*;
import java.net.*;

public class Q1_ArmstrongServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting...");
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        int n = in.readInt(), sum = 0, t = n, d = String.valueOf(n).length();
        for (; t > 0; t /= 10) sum += Math.pow(t % 10, d);
        out.writeUTF(n + (sum == n ? " is" : " is not") + " an Armstrong number");
        s.close();
        ss.close();
    }
}
