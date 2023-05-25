/*
 * Yulia Flenova
 * Version 1.0
 * June 27,2017
 * Exam
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Flenova_Yulia_FinalExam { //begin class

	protected static final int L3X = 0;
	protected static final int L2X = 0;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin public
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flenova_Yulia_FinalExam window = new Flenova_Yulia_FinalExam();
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
	public Flenova_Yulia_FinalExam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea tbxWeight = new JTextArea();
		tbxWeight.setBounds(341, 75, 78, 16);
		frame.getContentPane().add(tbxWeight);
		
		JLabel lblPostalCode = new JLabel("Enter postal code:");
		lblPostalCode.setBounds(6, 19, 123, 16);
		frame.getContentPane().add(lblPostalCode);
		
		JLabel lblExample = new JLabel("ex (L3X-5B7)");
		lblExample.setBounds(6, 47, 95, 16);
		frame.getContentPane().add(lblExample);
		
		JTextArea tbxHumanEnter = new JTextArea();
		tbxHumanEnter.setBounds(16, 75, 70, 16);
		frame.getContentPane().add(tbxHumanEnter);
		
		JLabel lblWhatIsYour = new JLabel("What is your name?");
		lblWhatIsYour.setBounds(165, 19, 123, 16);
		frame.getContentPane().add(lblWhatIsYour);
		
		JTextArea tbxName = new JTextArea();
		tbxName.setBounds(165, 75, 123, 16);
		frame.getContentPane().add(tbxName);
		
		JButton btnCalculateCost = new JButton("Calculate cost");
		btnCalculateCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int postalCode= Integer.parseInt(tbxHumanEnter.getText());    
				 int wieght= Integer.parseInt(tbxWeight.getText());    
				 int name= Integer.parseInt(tbxName.getText());    
				 	 
				 if ((postalCode == L3X)||(postalCode== L2X)){
				 int totalLocal=(int) (5+(1.5*wieght));
				 textField.setText("Your cost is " + totalLocal);		
			}
			else
			if (wieght<2){
				 int total=(int) (10+(wieght*1.5));
			 textField.setText("Your cost is " + total);	
			}
			if ( wieght >4.5 || wieght<2.1);{
			     int total2=(int) (10+(wieght*2.5));
				 textField.setText("Your cost is " + total2);	
			}
			if (wieght>4.5); {
			int total3=(int) (10+(wieght*3));
			 textField.setText("Your cost is " + total3);	
			}
			}	
		});
	
		btnCalculateCost.setBounds(165, 152, 117, 29);
		frame.getContentPane().add(btnCalculateCost);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(45, 193, 369, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterWeight = new JLabel("Enter Weight");
		lblEnterWeight.setBounds(348, 19, 96, 16);
		frame.getContentPane().add(lblEnterWeight);
	}
	
		int data[][] = new int[100][100];
		static void data(int[][] array) {
			int weight;
			int postalCode;
			int name;
			for (weight = 0; weight<100; weight ++) {  //weight loop
			    for(postalCode = 0; postalCode<100; postalCode++) //postaCode loop
			    	for(name = 0; name<100; name++) //name loop
			System.out.println( weight + postalCode + name);
		
		}
		
		}//end public
} //end class
