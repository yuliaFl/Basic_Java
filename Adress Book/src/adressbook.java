/*
 * Yulia Flenova
 * Date Feb 28 2017 
 * Version 1.0
 * Gui project, adress book 
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class adressbook { //begin class

	private JFrame frame;
	protected BufferedWriter output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { // begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adressbook window = new adressbook();
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
	public adressbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 128, 114));
		panel.setBounds(42, 6, 481, 29);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Contacts ");
		lblNewLabel.setBounds(199, 5, 82, 16);
		panel.add(lblNewLabel);
		
		JButton btnClick = new JButton("Click me");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Message", "Popup title", JOptionPane.WARNING_MESSAGE); // massage pop up

			}
		});
		btnClick.setBounds(358, 0, 117, 29);
		panel.add(btnClick);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(221, 160, 221));
		panel_1.setBounds(63, 39, 460, 232);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(6, 6, 68, 16);
		panel_1.add(lblFirstName);
		JTextArea textFIRSTNAME = new JTextArea();
		textFIRSTNAME.setBounds(6, 34, 108, 16);
		panel_1.add(textFIRSTNAME);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(154, 6, 68, 16);
		panel_1.add(lblLastName);
		JTextArea textLASTNAME = new JTextArea();
		textLASTNAME.setBounds(154, 34, 108, 16);
		panel_1.add(textLASTNAME);
		
		JLabel lblAdresses = new JLabel("Adresses ");
		lblAdresses.setBounds(329, 6, 61, 16);
		panel_1.add(lblAdresses);
		JTextArea textADRESS = new JTextArea();
		textADRESS.setBounds(330, 34, 124, 16);
		panel_1.add(textADRESS);
		
		JLabel lblCity = new JLabel("City ");
		lblCity.setBounds(6, 90, 61, 16);
		panel_1.add(lblCity);
		JTextArea textCITY = new JTextArea();
		textCITY.setBounds(6, 118, 114, 16);
		panel_1.add(textCITY);
		
		JLabel lblProvince = new JLabel("Province ");
		lblProvince.setBounds(161, 90, 61, 16);
		panel_1.add(lblProvince);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setBounds(332, 90, 74, 16);
		panel_1.add(lblPostalCode);
		JTextArea textPOSTALCODE = new JTextArea();
		textPOSTALCODE.setText("     ");
		textPOSTALCODE.setBounds(330, 118, 124, 16);
		panel_1.add(textPOSTALCODE);
		
		JLabel lblPhone = new JLabel("Phone 1");
		lblPhone.setBounds(6, 170, 61, 16);
		panel_1.add(lblPhone);
		JTextArea textPHONE1 = new JTextArea();
		textPHONE1.setText("      ");
		textPHONE1.setBounds(6, 198, 114, 16);
		panel_1.add(textPHONE1);
		
		JLabel lblPhone_1 = new JLabel("Phone 2");
		lblPhone_1.setBounds(171, 170, 61, 16);
		panel_1.add(lblPhone_1);
		JTextArea textPHONE2 = new JTextArea();
		textPHONE2.setText("    ");
		textPHONE2.setBounds(154, 198, 112, 16);
		panel_1.add(textPHONE2);
		
		JLabel lblEmailAdress = new JLabel("Email Adress ");
		lblEmailAdress.setBounds(332, 170, 85, 16);
		panel_1.add(lblEmailAdress);
		JTextArea textEMAILADRESS = new JTextArea();
		textEMAILADRESS.setBounds(329, 198, 125, 16);
		panel_1.add(textEMAILADRESS);
		
		JComboBox ProvinceBox = new JComboBox();
		ProvinceBox.setModel(new DefaultComboBoxModel(new String[] {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan"}));
		ProvinceBox.setBounds(210, 118, 52, 27);
		panel_1.add(ProvinceBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(61, 283, 460, 54);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewContact = new JButton("New Contact");
		btnNewContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEmailAdress.setText("");
				lblPhone_1.setText("");
				lblPhone.setText("");
				lblPostalCode.setText("");
				lblProvince.setText("");
				lblCity.setText("");
				lblAdresses.setText("");
				lblLastName.setText("");
				lblFirstName.setText("");
			}
		});
		btnNewContact.setBounds(0, 6, 117, 29);
		panel_2.add(btnNewContact);
		
		JButton btnUpdateContact = new JButton("Update Contact ");
		btnUpdateContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		System.out.println(textFIRSTNAME.getText()+ textLASTNAME.getText());
		System.out.println(textADRESS.getText() + textCITY.getText());
		System.out.println(textPHONE1.getText() + textPHONE2.getText());
		System.out.println(textPOSTALCODE.getText() + textCITY.getText() + textEMAILADRESS.getText());
			}
		});
		btnUpdateContact.setBounds(114, 6, 135, 29);
		panel_2.add(btnUpdateContact);
		
		JButton btnDeletContact = new JButton("Delet Contact");
		btnDeletContact.setBounds(251, 6, 117, 29);
		panel_2.add(btnDeletContact);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if  (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Exit!",  JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){ // when clicked yes shut down the window, when clicked no keep the window open
					System.exit(0);
		}


			}
		});
		btnExit.setBounds(367, 25, 93, 29);
		panel_2.add(btnExit);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
				    File file = new File("example.txt"); 
				     output = new BufferedWriter(new FileWriter(file));     
				           output.write(textFIRSTNAME.getText() + ":" + textLASTNAME.getText()+ ":" + textADRESS.getText());
			 
				} 
				catch ( IOException e ) { 
				e.printStackTrace(); 
				} 
				finally { 
				if ( output != null ) { 
				try {
					output.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} } 
				} 

			}
		});
		btnNewButton.setBounds(0, 0, 117, 29);
		panel.add(btnNewButton);
		BufferedWriter output = null;
		
	}//end public void
} //end class
	