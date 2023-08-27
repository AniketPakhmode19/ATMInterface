package atm;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
	
	public Component Frame() {
		JFrame frame = new JFrame("ATM Interface");
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		//...................ATM........................
		JLabel atm = new JLabel("ATM");
		atm.setBounds(160,30,600,120);
		atm.setFont(new Font("",Font.BOLD,20));
		
		JLabel man = new JLabel("MANAGMET");
		man.setBounds(220,30,600,120);
		man.setFont(new Font("",Font.BOLD,20));
		
		JLabel sys = new JLabel("SYSTEM");
		sys.setBounds(350,30,600,120);
		sys.setFont(new Font("",Font.BOLD,20));
	
		frame.add(atm);
		frame.add(man);
		frame.add(sys);
		
		return frame;
		
	}
}
