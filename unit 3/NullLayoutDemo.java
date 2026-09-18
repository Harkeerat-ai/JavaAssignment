package awt;

import java.awt.*;

class NullLayoutDemo extends Frame {

    Button btn;
    TextField txt;

    NullLayoutDemo() {

        // Set null layout for manual positioning
        setLayout(null);

        // Create Button
        btn = new Button("OK");
        btn.setSize(50, 25);
        btn.setLocation(25, 100);

        // Create TextField
        txt = new TextField("WELCOME TO JAVA");
        txt.setBounds(75, 100, 300, 25);

        // Add components to Frame
        add(btn);
        add(txt);
    }

    public static void main(String args[]) {

        // Create Frame object
        NullLayoutDemo demo = new NullLayoutDemo();

        // Set Frame size
        demo.setSize(400, 400);

        // Make Frame visible
        demo.setVisible(true);
    }
}