import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Q4_GUIServer extends Frame implements ActionListener {
    TextArea chat = new TextArea();
    TextField msg = new TextField();
    Button send = new Button("Send");
    DatagramSocket ds;

    Q4_GUIServer() throws Exception {
        // server receives on port 5001 and sends to client on port 5002
        ds = new DatagramSocket(5001);

        // chat area in the middle, text box and button at the bottom
        setTitle("Server");
        setLayout(new BorderLayout());
        add(chat, BorderLayout.CENTER);
        Panel bottom = new Panel(new BorderLayout());
        bottom.add(msg, BorderLayout.CENTER);
        bottom.add(send, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);

        send.addActionListener(this);

        // close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // runs when Send button is clicked
    public void actionPerformed(ActionEvent e) {
        try {
            String text = msg.getText();
            byte[] data = text.getBytes();
            DatagramPacket p = new DatagramPacket(data, data.length,
                    InetAddress.getByName("localhost"), 5002);
            ds.send(p);
            chat.append("Me: " + text + "\n");
            msg.setText("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception {
        Q4_GUIServer f = new Q4_GUIServer();

        // keep waiting for messages from the client
        while (true) {
            byte[] buffer = new byte[1024];
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            f.ds.receive(p);
            String text = new String(p.getData(), 0, p.getLength());
            f.chat.append("Client: " + text + "\n");
        }
    }
}
