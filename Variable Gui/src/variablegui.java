import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class variablegui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					variablegui window = new variablegui();
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
	public variablegui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setForeground(new Color(240, 248, 255));
		panel_2.setBounds(175, 6, 144, 343);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCulculateThe = new JLabel("Key to ASCII");
		lblCulculateThe.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblCulculateThe.setBounds(14, 11, 110, 16);
		panel_2.add(lblCulculateThe);
		
		JLabel lblEnter = new JLabel("Enter a number ");
		lblEnter.setBounds(7, 53, 131, 16);
		panel_2.add(lblEnter);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(10, 6, 157, 343);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterLenght = new JLabel("Enter length");
		lblEnterLenght.setBounds(10, 59, 109, 16);
		panel.add(lblEnterLenght);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 81, 99, 16);
		panel.add(textArea);
		
		JLabel lblCalculateTheArea = new JLabel("Calculate the ");
		lblCalculateTheArea.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblCalculateTheArea.setBounds(5, 0, 154, 41);
		panel.add(lblCalculateTheArea);
		
		JLabel lblAreaAndPeriter = new JLabel("Area and Perimeter");
		lblAreaAndPeriter.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblAreaAndPeriter.setBounds(6, 30, 144, 16);
		panel.add(lblAreaAndPeriter);
		
		JLabel lblEnterWidth = new JLabel("Enter Width");
		lblEnterWidth.setBounds(13, 115, 91, 16);
		panel.add(lblEnterWidth);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(24, 141, 99, 16);
		panel.add(textArea_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"cm ", "mm", "m"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(22, 190, 86, 28);
		panel.add(comboBox);
		
		JLabel lblChooseUnits = new JLabel("Choose units ");
		lblChooseUnits.setBounds(12, 170, 93, 16);
		panel.add(lblChooseUnits);
		
		JButton btnPerimeter = new JButton("Perimeter");
		btnPerimeter.setBounds(8, 229, 117, 29);
		panel.add(btnPerimeter);
		
		JButton btnArea = new JButton("Area");
		btnArea.setBounds(9, 267, 117, 29);
		panel.add(btnArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(18, 313, 127, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(328, 6, 149, 343);
		frame.getContentPane().add(panel_1);
	}
}
