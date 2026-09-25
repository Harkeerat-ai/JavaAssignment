import java.io.*;
import java.net.*;

public class Q1_ArmstrongServer {
    public static void main(String[] args) throws Exception {
        // create server on port 5000
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");

        // wait until a client connects
        Socket s = ss.accept();
        System.out.println("Client connected");

        // streams to read from and write to the client
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        // read the number sent by client
        int num = in.readInt();
        System.out.println("Number received: " + num);

        // count the digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // add each digit raised to the power of number of digits
        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        // send the result back to client
        if (sum == num) {
            out.writeUTF(num + " is an Armstrong number");
        } else {
            out.writeUTF(num + " is not an Armstrong number");
        }

        s.close();
        ss.close();
    }
}
