import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.swing.JOptionPane;


public class AdressBook {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdressBook window = new AdressBook();
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
	public AdressBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(154, 6, 68, 16);
		panel_1.add(lblLastName);
		
		JLabel lblAdresses = new JLabel("Adresses ");
		lblAdresses.setBounds(332, 6, 61, 16);
		panel_1.add(lblAdresses);
		
		JLabel lblCity = new JLabel("CIty ");
		lblCity.setBounds(6, 90, 61, 16);
		panel_1.add(lblCity);
		
		JLabel lblProvince = new JLabel("Province ");
		lblProvince.setBounds(161, 90, 61, 16);
		panel_1.add(lblProvince);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setBounds(332, 90, 74, 16);
		panel_1.add(lblPostalCode);
		
		JLabel lblPhone = new JLabel("Phone 1");
		lblPhone.setBounds(6, 170, 61, 16);
		panel_1.add(lblPhone);
		
		JLabel lblPhone_1 = new JLabel("Phone 2");
		lblPhone_1.setBounds(171, 170, 61, 16);
		panel_1.add(lblPhone_1);
		
		JLabel lblEmailAdress = new JLabel("Email Adress ");
		lblEmailAdress.setBounds(332, 170, 85, 16);
		panel_1.add(lblEmailAdress);
		
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
				System.exit(0);  //Program will close when this button is clicked
			}
		});
		btnExit.setBounds(367, 25, 93, 29);
		panel_2.add(btnExit);
	}
}
