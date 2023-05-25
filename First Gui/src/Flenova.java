import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class Flenova {

	private JFrame frmGUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flenova window = new Flenova();
					window.frmGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Flenova() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGUI = new JFrame( "Yulia GUI");
		frmGUI.getContentPane().setBackground(new Color(175, 238, 238));
		frmGUI.setBounds(100, 100, 616, 520);
		frmGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGUI.getContentPane().setLayout(null);
		
		JButton btnClickMe = new JButton("Click me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("HAVE A GREAT SUMMER");  //Program displays Hello world in the console screen
				btnClickMe.setText("SUMMER");

			}
		});
		btnClickMe.setBounds(496, 407, 117, 29);
		frmGUI.getContentPane().add(btnClickMe);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);  //Program will close when this button is clicked

			}
		});
		btnExit.setBounds(496, 448, 117, 29);
		frmGUI.getContentPane().add(btnExit);
		
		JLabel lblMyFirstLabel = new JLabel("Places to go in the summer ");
		lblMyFirstLabel.setFont(new Font("Zapfino", Font.PLAIN, 20));
		lblMyFirstLabel.setBounds(6, 6, 361, 69);
		frmGUI.getContentPane().add(lblMyFirstLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Computer science?");
		chckbxNewCheckBox.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(6, 160, 173, 22);
		frmGUI.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Hicking? ");
		chckbxNewCheckBox_1.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		chckbxNewCheckBox_1.setBounds(6, 114, 193, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxComputerAnimation = new JCheckBox("Swimming? \n");
		chckbxComputerAnimation.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		chckbxComputerAnimation.setBounds(6, 135, 193, 23);
		frmGUI.getContentPane().add(chckbxComputerAnimation);
		
		JToggleButton tglbtnOnoff = new JToggleButton("ON/OFF");
		tglbtnOnoff.setBounds(179, 73, 161, 29);
		frmGUI.getContentPane().add(tglbtnOnoff);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Flenova.class.getResource("/image/pic_mountain.jpg")));
		lblNewLabel.setBounds(352, -1, 261, 220);
		frmGUI.getContentPane().add(lblNewLabel);
		JButton btnHide = new JButton("Hide");
		btnHide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblNewLabel.setVisible(false);
			}
		});
		btnHide.setBounds(381, 231, 117, 29);
		frmGUI.getContentPane().add(btnHide);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(true);
			}
		});
		btnShow.setBounds(496, 231, 117, 29);
		frmGUI.getContentPane().add(btnShow);
		
		
		
		JComboBox cboProvinces = new JComboBox();
		cboProvinces.setModel(new DefaultComboBoxModel(new String[] {"Asia ", "North America", "South America", "Europe "}));
		cboProvinces.setBounds(17, 284, 124, 27);
		frmGUI.getContentPane().add(cboProvinces);
		
		JTextArea txtrWhatDoYou = new JTextArea();
		txtrWhatDoYou.setFont(new Font("Al Bayan", Font.PLAIN, 15));
		txtrWhatDoYou.setBackground(new Color(175, 238, 238));
		txtrWhatDoYou.setText("What do you like?");
		txtrWhatDoYou.setBounds(17, 80, 182, 22);
		frmGUI.getContentPane().add(txtrWhatDoYou);
		
		JTextArea txtrbox = new JTextArea();
		txtrbox.setText("MUHAMORI");
		txtrbox.setBounds(293, 304, 139, 16);
		frmGUI.getContentPane().add(txtrbox);
		
		JButton btnChangeText = new JButton("Change Text ");
		btnChangeText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMyFirstLabel.setText(txtrbox.getText());
			}
		});
		btnChangeText.setBounds(315, 332, 117, 29);
		frmGUI.getContentPane().add(btnChangeText);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Warm weather? ");
		chckbxNewCheckBox_2.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		chckbxNewCheckBox_2.setBounds(6, 180, 161, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Cold weather? ");
		chckbxNewCheckBox_3.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		chckbxNewCheckBox_3.setBounds(6, 204, 149, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox_3);
		
		JLabel lblWhatPartOf = new JLabel("What part of the world do you want to go? ");
		lblWhatPartOf.setFont(new Font("Al Bayan", Font.PLAIN, 15));
		lblWhatPartOf.setBounds(17, 256, 317, 16);
		frmGUI.getContentPane().add(lblWhatPartOf);
		
		JTextArea txtrTipsForTraveling = new JTextArea();
		txtrTipsForTraveling.setBackground(new Color(175, 238, 238));
		txtrTipsForTraveling.setText("Tips for traveling \n- stay petient \n- wake up early\n-have extra cash \n- have a back up for everything " );
		txtrTipsForTraveling.setBounds(17, 344, 228, 92);
		frmGUI.getContentPane().add(txtrTipsForTraveling);
		JButton btnClearText = new JButton("Clear Text ");
		btnClearText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTipsForTraveling.setText("");
			}
		});
		btnClearText.setBounds(6, 445, 117, 29);
		frmGUI.getContentPane().add(btnClearText);
		
		JButton btnShowText = new JButton("Show text");
		btnShowText.setBounds(128, 448, 117, 29);
		frmGUI.getContentPane().add(btnShowText);
	
	
		
	}
}
