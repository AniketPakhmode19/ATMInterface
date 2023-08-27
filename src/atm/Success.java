package atm;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Success {
	public void successView(int id)throws SQLException{
		Home home = new Home();
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		
		//...................Success.....................
		JLabel sucss = new JLabel("TRANSACTION SUCCESS");
		sucss.setBounds(0,280,600,50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		frame.add(sucss);
		
		home.homeView(id);
		frame.setVisible(true);
	}
	
	public void detailView(String num,String pin) {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		
		//.................Details........................
		JLabel sucss = new JLabel("ACCOUNT SUCCESSFULLY ADDED");
		sucss.setBounds(0,200,600,50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		frame.add(sucss);
		JTextField cardnumber = new JTextField("CARD NUMBER : "+num);
		cardnumber.setBounds(0,300,600,50);
		cardnumber.setEditable(false);
		cardnumber.setHorizontalAlignment(JLabel.CENTER);
		frame.add(cardnumber);
		JTextField pinnumber = new JTextField("DEFAULT PIN : "+pin);
		pinnumber.setBounds(0,400,600,50);
		pinnumber.setEditable(false);
		pinnumber.setHorizontalAlignment(JLabel.CENTER);
		frame.add(pinnumber);
		
		frame.setVisible(true);
		
	}
}
