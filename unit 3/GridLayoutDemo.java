package awt;

import java.awt.*;
class GridLayoutDemo extends Frame {
	Button btn[] = new Button[15];
	GridLayoutDemo() {
	
		for(int i=0;i<btn.length;i++) {
			btn[i] = new Button(""+i);
			add(btn[i]);
		}
		//GridLayout flow = new GridLayout(3,5);
		GridLayout flow = new GridLayout(3,5,10,10);
		setLayout(flow);}
	public static void main(String args[]) {
		GridLayoutDemo demo = new GridLayoutDemo();
		demo.setSize(400,400);
		demo.setVisible(true);
	}
}