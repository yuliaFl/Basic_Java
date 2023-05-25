import java.awt.EventQueue;
import java.text.ParseException;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class asciiproject { //being class

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main (String args []) throws ParseException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asciiproject window = new asciiproject();
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
	public asciiproject() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ASCII convertor");
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 585, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	

				
		JLabel lblEnterANumber = new JLabel("Enter a number better between 33 and 225");
		lblEnterANumber.setFont(new Font("Al Bayan", Font.BOLD | Font.ITALIC, 15));
		lblEnterANumber.setBounds(18, 17, 328, 31);
		frame.getContentPane().add(lblEnterANumber);
		
		JTextArea txthumannumber = new JTextArea();
		txthumannumber.setBounds(28, 60, 68, 16);
		frame.getContentPane().add(txthumannumber);

		JTextArea txtanwser = new JTextArea();
		txtanwser.setBounds(18, 92, 374, 16);
		frame.getContentPane().add(txtanwser);
		
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int yourInt= Integer.parseInt(txthumannumber.getText());  	
				 String s = new Character((char)yourInt).toString(); 				 
				 txtanwser.setText("The number you put in is " + yourInt + " this number in ASCII is " + s);	
			}
		});
		btnConvert.setBounds(462, 55, 117, 29);
		frame.getContentPane().add(btnConvert);
		
		JLabel lblEnterALetter = new JLabel("Enter a letter");
		lblEnterALetter.setFont(new Font("Al Bayan", Font.BOLD | Font.ITALIC, 15));
		lblEnterALetter.setBounds(18, 142, 328, 16);
		frame.getContentPane().add(lblEnterALetter);
		
		JTextArea txtletter = new JTextArea();
		txtletter.setBounds(28, 170, 68, 16);
		frame.getContentPane().add(txtletter);
		
		JTextArea txtanwsertoletter = new JTextArea();
		txtanwsertoletter.setBounds(18, 198, 374, 16);
		frame.getContentPane().add(txtanwsertoletter);
		
		JButton btnConvertLetter = new JButton("Convert");
		btnConvertLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String humanInt= txtletter.getText();		 
				 char firstLatter = humanInt.charAt(0);	
				 int numASCII = (int)firstLatter;                 
				 txtanwsertoletter.setText("The letter you put in is " + humanInt + " this in ASCII is " + numASCII);	
			}
		});
		
		btnConvertLetter.setBounds(462, 165, 117, 29);
		frame.getContentPane().add(btnConvertLetter);
		
		JLabel lblEnterANumber_1 = new JLabel("Enter a decimal number i will find the cube and the square root of it");
		lblEnterANumber_1.setFont(new Font("Al Bayan", Font.BOLD | Font.ITALIC, 15));
		lblEnterANumber_1.setBounds(18, 241, 512, 16);
		frame.getContentPane().add(lblEnterANumber_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 269, 68, 16);
		frame.getContentPane().add(textArea);
				
		JTextArea txtanwsermath = new JTextArea();
		txtanwsermath.setBounds(18, 297, 381, 16);
		frame.getContentPane().add(txtanwsermath);
		
		JTextArea txtsecondanwser= new JTextArea();
		txtsecondanwser.setBounds(18, 325, 385, 16);
		frame.getContentPane().add(txtsecondanwser);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				 Double doubleValue = Double.parseDouble(textArea.getText());
				 long newnumber = doubleValue.longValue();
				 double cube= Math.pow(newnumber, 2);
				 double sqroot= Math.sqrt(newnumber);
				 NumberFormat roundroot = NumberFormat.getInstance();	
				 roundroot.setMaximumFractionDigits(2);
				 txtanwsermath.setText(" The cube of your nuber is " + cube);	
				 txtsecondanwser.setText(" The square root of your number is " + roundroot.format(sqroot));
			}
			});
		
		btnCalculate.setBounds(462, 269, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
	}
}

	