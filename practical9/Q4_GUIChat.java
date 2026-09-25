import java.awt.*;
import java.net.*;

// Two windows over UDP. Run: "java Q4_GUIChat server" and "java Q4_GUIChat client"
public class Q4_GUIChat {
    public static void main(String[] args) throws Exception {
        boolean server = args.length > 0 && args[0].equals("server");
        int me = server ? 5001 : 5002, peer = server ? 5002 : 5001;
        DatagramSocket s = new DatagramSocket(me);
        Frame f = new Frame(server ? "Server" : "Client");
        TextArea log = new TextArea();
        TextField tf = new TextField();
        Button b = new Button("Send");
        Panel p = new Panel(new BorderLayout());
        p.add(tf);
        p.add(b, BorderLayout.EAST);
        f.add(log);
        f.add(p, BorderLayout.SOUTH);
        f.setSize(300, 300);
        f.setVisible(true);
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) { System.exit(0); }
        });
        b.addActionListener(e -> {
            try {
                byte[] d = tf.getText().getBytes();
                s.send(new DatagramPacket(d, d.length, InetAddress.getLocalHost(), peer));
                log.append("Me: " + tf.getText() + "\n");
                tf.setText("");
            } catch (Exception x) { log.append(x + "\n"); }
        });
        while (true) {
            DatagramPacket r = new DatagramPacket(new byte[1024], 1024);
            s.receive(r);
            log.append("Them: " + new String(r.getData(), 0, r.getLength()) + "\n");
        }
    }
}
