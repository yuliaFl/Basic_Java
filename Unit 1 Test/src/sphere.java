/*
 * Yulia Flenova
 * Verson 1.0
 * March 23 2017
 * unit 1 test
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sphere { //begin class

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sphere window = new sphere();
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
	public sphere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Yulia Unit 1 Test");
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 472, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter a number for the radius");
		lblNewLabel.setBounds(28, 41, 245, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea valueRadius= new JTextArea();
		valueRadius.setBounds(38, 95, 109, 16);
		frame.getContentPane().add(valueRadius);
		
		JTextArea txtanwser = new JTextArea();
		txtanwser.setBounds(38, 131, 402, 16);
		frame.getContentPane().add(txtanwser);
	
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int givenRadius = Integer.parseInt(valueRadius.getText());
				 double PI= 3.14159;
				 double operation = Math.pow(givenRadius, 2);
				 double volume =  4 * (PI * operation)/3;
				 double finalnumber = Math.round(volume);
		txtanwser.setText("Your number was " + givenRadius + ", the volume of your sphere is " + finalnumber);	
				 
			}
		});
		btnSend.setBounds(306, 76, 117, 29);
		frame.getContentPane().add(btnSend);
		

	} //end main
} //end class
