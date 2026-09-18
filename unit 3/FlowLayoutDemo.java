package awt;

import java.awt.*;
class FlowLayoutDemo extends Frame {
	Button btn[] = new Button[15];
	FlowLayoutDemo() {		
		for(int i=0;i<btn.length;i++) {
		btn[i] = new Button(""+i);
			add(btn[i]);
		}
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT,40,40);
		setLayout(flow);
	}
	public static void main(String args[]) {
FlowLayoutDemo demo = new FlowLayoutDemo();		demo.setSize(400,400);		demo.setVisible(true);	}
}
