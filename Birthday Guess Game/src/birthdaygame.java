/*
 * Yulia Flenova
 * March 8 2017
 * Version 1.0
 * Birthday game
 */
import java.awt.EventQueue;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class birthdaygame { //begin class

	private JFrame frm;
	private JTextField anwserfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					birthdaygame window = new birthdaygame();
					window.frm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public birthdaygame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm = new JFrame("Birthday game");
		frm.getContentPane().setBackground(new Color(255, 255, 224));
		frm.setBounds(100, 100, 553, 388);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		JLabel lblpicture = new JLabel("");
		lblpicture.setIcon( new ImageIcon(getClass().getResource("images.jpg")));
		lblpicture.setBounds(290, 113, 313, 140);
		frm.getContentPane().add(lblpicture);
		
		JLabel lblThisIsA = new JLabel("This is a birthday game\n");
		lblThisIsA.setFont(new Font("Al Bayan", Font.ITALIC, 20));
		lblThisIsA.setBounds(6, 19, 241, 38);
		frm.getContentPane().add(lblThisIsA);
		
		JLabel lblF = new JLabel("Follow the instruction and i will guess your birthday ");
		lblF.setFont(new Font("Al Bayan", Font.ITALIC, 18));
		lblF.setBounds(93, 57, 438, 28);
		frm.getContentPane().add(lblF);
		
		JTextArea txtrTestTest = new JTextArea();
		txtrTestTest.setEditable(false);
		txtrTestTest.setFont(new Font("Al Bayan", Font.PLAIN, 15));
		txtrTestTest.setBackground(new Color(255, 255, 224));
		txtrTestTest.setText("1. Determine your birth month (ex. Jan-1, Feb-2, ect)\n2.Multiply that number by 5 \n3. Add 6 to that number\n4. Multiply that number by 4\n5. Add 9 to that number\n6. Multiply that number by 5\n7. Add your birth date to that number ");
		txtrTestTest.setBounds(16, 88, 375, 168);
		frm.getContentPane().add(txtrTestTest);
		
		JLabel lblEnterYourNumber = new JLabel("Enter your number ");
		lblEnterYourNumber.setFont(new Font("Al Bayan", Font.PLAIN, 15));
		lblEnterYourNumber.setBounds(42, 268, 146, 17);
		frm.getContentPane().add(lblEnterYourNumber);
		
		JTextArea txtnumber = new JTextArea();
		txtnumber.setBackground(new Color(224, 255, 255));
		txtnumber.setForeground(new Color(0, 0, 0));
		txtnumber.setBounds(183, 268, 92, 16);
		frm.getContentPane().add(txtnumber);
	
		JButton btnGetBirthDate = new JButton("Get birth date");
		btnGetBirthDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int givennumber= Integer.parseInt(txtnumber.getText());                    // the number given by user 
				int subtractnumber= 165;                                                   // subtract this number 
				int dividenumber=100;                                                      // divide the number 
				double bithday=(double)(givennumber-subtractnumber)/dividenumber;          //formula to use
	
				int month = (givennumber-subtractnumber)/dividenumber;                     //how to get month
				int day = (int)Math.round((bithday - month) * 100);                        // how t get day
				
				anwserfield.setText("Your birth month is " + month + " and your birthday is " + day);		       
			}
			});
		btnGetBirthDate.setBounds(370, 268, 117, 29);
		frm.getContentPane().add(btnGetBirthDate);
		
		anwserfield = new JTextField();
		anwserfield.setBounds(32, 315, 492, 26);
		frm.getContentPane().add(anwserfield);
		anwserfield.setColumns(10);


		
	} //end main
} // end class
