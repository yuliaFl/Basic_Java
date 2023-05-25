/*
 * Yulia Flenova
 * March 27
 * Version 1.0
 * how many seconds from the begging of the year to your birthday  
 */
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class statment { //begin class

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statment window = new statment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public statment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { 
		frame = new JFrame("Seconds into the year");
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 604, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFindOutHow = new JLabel("How many seconds in to the year is your birthday?");
		lblFindOutHow.setFont(new Font("Al Bayan", Font.ITALIC, 20));
		lblFindOutHow.setBounds(6, 14, 598, 31);
		frame.getContentPane().add(lblFindOutHow);
		
		JLabel lblEnterTheMonth = new JLabel("Enter the month of your birthday");
		lblEnterTheMonth.setFont(new Font("Al Bayan", Font.ITALIC, 18));
		lblEnterTheMonth.setBounds(17, 80, 319, 31);
		frame.getContentPane().add(lblEnterTheMonth);
		
		JLabel lblEnterTheDay = new JLabel("Enter the day of your birthday");
		lblEnterTheDay.setFont(new Font("Al Bayan", Font.ITALIC, 18));
		lblEnterTheDay.setBounds(17, 158, 301, 31);
		frame.getContentPane().add(lblEnterTheDay);
		
		JTextField txtday = new JTextField();
		txtday.setBounds(17, 192, 55, 16);
		frame.getContentPane().add(txtday);
		
		JTextField txtmonth = new JTextField();
		txtmonth.setBounds(17, 123, 55, 16);
		frame.getContentPane().add(txtmonth);
		
		JTextField txtanwser = new JTextField();
		txtanwser.setBounds(17, 286, 425, 16);
		frame.getContentPane().add(txtanwser);
		
		JButton btnCalculate = new JButton("Caluculate");
		btnCalculate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
			 int day = Integer.parseInt(txtday.getText());
		   	int month = Integer.parseInt(txtmonth.getText());
		   	
		   	if( month == 1 ) {
		   		int January =  day * 24 * 60 * 60;
			   	 txtanwser.setText(January  + " seconds in to the year is your birthday");
		   	}
		   	if ( month == 2) {
		   		int February = (31+day)*24*60*60;
		   	 txtanwser.setText(February  + " seconds in to the year is your birthday");
		   	}
		  	if ( month == 3) {
		   		int March = (31 + 28 + day) * 24 * 60 *60; 
		   	 txtanwser.setText( March + " seconds in to the year is your birthday");
		   	}
		 	if ( month == 4) {
		   		int April = (31 + 28 + 31 + day) * 24 * 60 *60; 
		   	 txtanwser.setText( April + " seconds in to the year is your birthday");
		   	}
			if ( month == 5) {
		   		int May = (31 + 28 + 31 + 30 + day )* 24 * 60 *60; 
		   	 txtanwser.setText( May + " seconds in to the year is your birthday");
			}
		 	if ( month == 6) {
		   		int June = (31 + 28 + 31 + 30 + 31 + day) * 24 * 60 *60; 
		   	 txtanwser.setText( June + " seconds in to the year is your birthday");
		   	}
			if ( month == 7) {
		   		int July = (31 + 28 + 31 + 30 + 31 + 30 + day )* 24 * 60 *60;  
		   	 txtanwser.setText( July + " seconds in to the year is your birthday");
		   	}
			if ( month == 8) {
		   		int August =  (31 + 28 + 31 + 30 + 31 + 30 + 31 + day) * 24 * 60 *60;   
		   	 txtanwser.setText( August + " seconds in to the year is your birthday");
		   	}
			if ( month == 9) {
		   		int September = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31  + day) * 24 * 60 *60;
		   	 txtanwser.setText( September + " seconds in to the year is your birthday");
		   	}
			if ( month == 10) {
		   		int October = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day) * 24 * 60 *60;
		   	 txtanwser.setText( October + " seconds in to the year is your birthday");
		   	}
			if ( month == 11) {
		   		int Novomber = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day) * 24 * 60 *60;
		   	 txtanwser.setText( Novomber + " seconds in to the year is your birthday");
		   	}
			if ( month == 12) {
		   		int December =  (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day) * 24 * 60 *60;
		   	 txtanwser.setText( December + " sconds in to the year is your birthday");
		   	}

		} 
	});
		btnCalculate.setBounds(17, 234, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
	
	} //end main

} // end class
