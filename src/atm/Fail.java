package atm;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fail {
	public void failView(String str) {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		
		//..................Fail.................
		JLabel fail = new JLabel("YOUR TRANSACTION FAILED!!!");
		fail.setBounds(0,280,600,50);
		fail.setHorizontalAlignment(JLabel.CENTER);		
		JLabel st = new JLabel(str); 
		st.setBounds(0,320,600,50);
		st.setHorizontalAlignment(JLabel.CENTER);
		frame.add(fail);
		frame.add(st);
		
		frame.setVisible(true);
	}
}
