package awt;

import java.awt.*;
class BorderLayoutDemo extends Frame {
	Button b1,b2,b3,b4;
	TextField txt;
	BorderLayoutDemo() {
		
		b1 = new Button("CENTER");	
		b2 = new Button("EAST");	
		b3 = new Button("WEST");	
		b4 = new Button("SOUTH");	
		txt = new TextField("NORTH");
		
		setLayout(new BorderLayout());

		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.WEST);
		add(b4,BorderLayout.SOUTH);
		add(txt,BorderLayout.CENTER);                                
                     }
	public static void main(String args[]) {
                 BorderLayoutDemo demo = new BorderLayoutDemo();
		demo.setSize(400,400);
		demo.setVisible(true);
	}
}
