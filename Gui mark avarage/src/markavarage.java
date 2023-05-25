/*
 * Yulia Flenova
 * March 28
 * Version 1.0
 * Gui, avarage marks 
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class markavarage { //begin class

	private JFrame frame;
	private JTextField txtenglish;
	private JTextField txtchemistry;
	private JTextField txtmath;
	private JTextField txtcomp;
	private JTextField txtanwser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					markavarage window = new markavarage();
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
	public markavarage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Mark avarage");
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 489, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourMark = new JLabel("Enter your marks");
		lblEnterYourMark.setFont(new Font("Al Bayan", Font.ITALIC, 20));
		lblEnterYourMark.setBounds(19, 21, 247, 25);
		frame.getContentPane().add(lblEnterYourMark);
		
		JLabel lblNewLabel = new JLabel("English");
		lblNewLabel.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblNewLabel.setBounds(19, 61, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblChemistry.setBounds(119, 58, 94, 16);
		frame.getContentPane().add(lblChemistry);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblMath.setBounds(225, 61, 61, 16);
		frame.getContentPane().add(lblMath);
		
		JLabel lblNewLabel_1 = new JLabel("Computer Science");
		lblNewLabel_1.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(315, 60, 129, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtenglish = new JTextField();
		txtenglish.setBounds(19, 84, 51, 26);
		frame.getContentPane().add(txtenglish);
		txtenglish.setColumns(10);
		
		txtchemistry = new JTextField();
		txtchemistry.setBounds(119, 84, 51, 26);
		frame.getContentPane().add(txtchemistry);
		txtchemistry.setColumns(10);
		
		txtmath = new JTextField();
		txtmath.setBounds(225, 84, 51, 26);
		frame.getContentPane().add(txtmath);
		txtmath.setColumns(10);
		
		txtcomp = new JTextField();
		txtcomp.setBounds(325, 84, 51, 26);
		frame.getContentPane().add(txtcomp);
		txtcomp.setColumns(10);
		
		txtanwser = new JTextField();
		txtanwser.setBounds(19, 182, 425, 26);
		frame.getContentPane().add(txtanwser);
		txtanwser.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
			 int english = Integer.parseInt(txtenglish.getText());
			 int math = Integer.parseInt(txtmath.getText());
			 int chemistry = Integer.parseInt(txtchemistry.getText());
			 int comp = Integer.parseInt(txtcomp.getText());
			 
			 int avarage = (english + math + chemistry + comp)/ 4;
			 
			 if  (avarage >= 95 )  { 
				 txtanwser.setText( "Your avarage is A+ ");
			 }
			
				else if (( avarage >= 90) && (avarage <+ 94))  { 
					 txtanwser.setText( "Your avarage is A ");
				} 
			 
				else if ( (avarage >= 85) && (avarage <= 89) )  { 
				txtanwser.setText("Your avarage is A-  ");
				} 
			 
				else if ( (avarage >= 75) && (avarage <= 84 ))  { 
				txtanwser.setText("Your avarage is B");
				} 
			
				else   { 
		txtanwser.setText("Your avarage is less then 50, that is a F");
				}
		 }
		});
		btnCalculate.setBounds(167, 141, 117, 29);
		frame.getContentPane().add(btnCalculate);
}//end main
}//end class
