/*
 * Yulia Flenova
 * March 28 
 * Version 1.0
 * Rock Paper Scissors game, human clicks a button of their choice, computer randomly chooses one thing, both anwsers are displayed, a score is kept
 */
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class rpsgame { //begin class

	private JFrame frame;
	private JTextField txtscore;
	private JTextField txtcompscore;
	private JTextField txttie;
	private JTextField txthumananwser;
	private JTextField txtcompanwser;
	private JTextField txtwins;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rpsgame window = new rpsgame();
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
	public rpsgame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Rock Paper Scissors game");
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 725, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYou = new JLabel("You");
		lblYou.setFont(new Font("Al Bayan", Font.ITALIC, 20));
		lblYou.setBounds(92, 25, 61, 31);
		frame.getContentPane().add(lblYou);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Al Bayan", Font.ITALIC, 20));
		lblComputer.setBounds(547, 25, 117, 31);
		frame.getContentPane().add(lblComputer);
		
		JLabel lblYourScore = new JLabel("Your score"); // score for human
		lblYourScore.setBounds(338, 72, 72, 16);
		frame.getContentPane().add(lblYourScore);
		
		txtscore = new JTextField();
		txtscore.setEditable(false);
		txtscore.setBounds(359, 100, 51, 26);
		txtscore.setText("0");
		frame.getContentPane().add(txtscore);
		txtscore.setColumns(10);
		
		JLabel lblComputer_1 = new JLabel("Computer "); //score for computer
		lblComputer_1.setBounds(338, 150, 72, 16);
		frame.getContentPane().add(lblComputer_1);
		
		JLabel lblScore = new JLabel("score");
		lblScore.setBounds(368, 164, 42, 16);
		frame.getContentPane().add(lblScore);
		
		txtcompscore = new JTextField();
		txtcompscore.setEditable(false);
		txtcompscore.setText("0");
		txtcompscore.setBounds(359, 192, 51, 26);
		frame.getContentPane().add(txtcompscore);
		txtcompscore.setColumns(10);
		
		JLabel lblTies = new JLabel("Ties");          // score for a tie
		lblTies.setBounds(359, 230, 61, 16);
		frame.getContentPane().add(lblTies);
		
		txttie = new JTextField();
		txttie.setEditable(false);
		txttie.setText("0");
		txttie.setBounds(359, 253, 51, 26);
		frame.getContentPane().add(txttie);
		txttie.setColumns(10);
		
		JButton btnRestart = new JButton("Play again"); //restart button
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txttie.setText("0");
				txtcompscore.setText("0");
				txtscore.setText("0");
				txtwins.setText (" ");
			}
		});
		btnRestart.setBounds(473, 422, 117, 29);
		frame.getContentPane().add(btnRestart);
		
		JButton btnExit = new JButton("Exit");      // exit button
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
	
		btnExit.setBounds(602, 422, 117, 29);
		frame.getContentPane().add(btnExit);
		
		txthumananwser = new JTextField();
		txthumananwser.setBounds(103, 356, 130, 26);
		frame.getContentPane().add(txthumananwser);
		txthumananwser.setColumns(10);
	
		
		JButton btnRock = new JButton("Rock");         //button rock
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txthumananwser.setText("Rock");
				play();
			}
		});
		
		btnRock.setBackground(new Color(0, 139, 139));
		btnRock.setBounds(195, 192, 117, 29);
		frame.getContentPane().add(btnRock);
		
		JButton btnPaper = new JButton("Paper");       //button paper
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txthumananwser.setText("Paper");
				play();
			}
		});
		btnPaper.setBounds(118, 280, 117, 29);
		frame.getContentPane().add(btnPaper);
		
		JButton btnScissors = new JButton("Scissors"); //button scissors
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txthumananwser.setText("Scissors");
				play();
			}
		});
		btnScissors.setBackground(new Color(240, 248, 255));
		btnScissors.setBounds(82, 72, 117, 29);
		frame.getContentPane().add(btnScissors);
	
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 74, 280, 226);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(rpsgame.class.getResource("/gameimage/imgres.png")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(rpsgame.class.getResource("/imagegame2/imgres.jpg")));
		lblNewLabel_1.setBounds(477, 68, 258, 244);
		frame.getContentPane().add(lblNewLabel_1);
		*/
		JLabel lblYouChoose = new JLabel("You choose");
		lblYouChoose.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblYouChoose.setBounds(6, 362, 101, 16);
		frame.getContentPane().add(lblYouChoose);
		
		JLabel lblComputerChoose = new JLabel("Computer choose");
		lblComputerChoose.setFont(new Font("Al Bayan", Font.ITALIC, 15));
		lblComputerChoose.setBounds(442, 362, 142, 16);
		frame.getContentPane().add(lblComputerChoose);
		
		txtcompanwser = new JTextField();
		txtcompanwser.setBounds(589, 356, 130, 26);
		frame.getContentPane().add(txtcompanwser);
		txtcompanwser.setColumns(10);
		
		
		txtwins = new JTextField();
		txtwins.setFont(new Font("Yuppy TC", Font.BOLD | Font.ITALIC, 25));
		txtwins.setBackground(new Color(230, 230, 250));
		txtwins.setEditable(false);
		
		
		txtwins.setBounds(282, 25, 172, 45);
		frame.getContentPane().add(txtwins);
		txtwins.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(rpsgame.class.getResource("/imagecomp/imgres.jpg")));
		lblNewLabel.setBounds(496, 53, 223, 270);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(rpsgame.class.getResource("/imagehands/imgres.png")));
		lblNewLabel_1.setBounds(6, 61, 295, 256);
		frame.getContentPane().add(lblNewLabel_1);
				
				/*
				if ((choice1.equals("Rock") && (choice2.equals("Scissors" )))){ //if human chooses rock and comp chooses scissors
					int score = Integer.parseInt(txtscore.getText()) +1;        // human wins
					txtscore.setText( String.valueOf(score));
				}
				
				if ((choice1.equals("Scissors") && (choice2.equals("Paper")))) { //if human chooses scissors and comp chooses paper
					int score = Integer.parseInt(txtscore.getText()) + 1;        //  human wins
					txtscore.setText( String.valueOf(score));
				}
				
				if ((choice1.equals("Paper") && (choice2.equals("Rock")))) { //if human chooses paper and comp chooses rock
					int score = Integer.parseInt(txtscore.getText()) + 1;    // human wins
					txtscore.setText( String.valueOf(score));
				}
				
				
				if ((choice2.equals("Rock") && (choice1.equals("Scissors")))) { //if comp chooses rock and humans chooses scissors
					int score = Integer.parseInt(txtcompscore.getText()) + 1; // comp wins
					txtcompscore.setText( String.valueOf(score));
				}
				
				
				
				if ((choice1.equals("Scissors") && (choice1.equals("Paper")))) {//if comp chooses scissors and humans chooses paper
					int score = Integer.parseInt(txtcompscore.getText()) + 1; //comp wins
					txtcompscore.setText( String.valueOf(score));
				}
				
				if ((choice2.equals("Paper") && (choice1.equals("Rock")))) { //if comp chooses paper and humans chooses rock
					int score = Integer.parseInt(txtcompscore.getText()) + 1; //comp wins
					txtcompscore.setText( String.valueOf(score));
				}
				
				if ((choice2.equals("Paper") && (choice1.equals("Paper")))) {//if both choose paper
					int score = Integer.parseInt(txttie.getText()) + 1; //its a tie
					txttie.setText( String.valueOf(score));
				}
				
				if ((choice2.equals("Rock") && (choice1.equals("Rock")))) { // if both choose rock
					int score = Integer.parseInt(txttie.getText()) + 1; //its a tie
					txttie.setText( String.valueOf(score));
				}
				
				if ((choice2.equals("Scissors") && (choice1.equals("Scissors")))) { //if both choose scissors
					int score = Integer.parseInt(txttie.getText()) + 1; //its a tie
					txttie.setText( String.valueOf(score));
				}
				*/	

	} //end main
	
	void play () {
		Random rand = new Random(); 
		int pickedNumber = rand.nextInt(3); //choose a random
		String[] choices = { "Rock", "Paper", "Scissors"}; // possible choices 
		
		txtcompanwser.setText(choices[pickedNumber]);
		String choice1 = txthumananwser.getText();  // choice1 is what the human chooses
		String choice2 = choices[pickedNumber];     // choice2 is what computer chooses
		txtwins.setText("");		
		switch (choice1) {
			case "Rock":
				if (choice2 ==  "Scissors") {
					int score = Integer.parseInt(txtscore.getText()) + 1;  
					txtscore.setText( String.valueOf(score));
				}
				else if (choice2 ==  "Paper") {
					int score = Integer.parseInt(txtcompscore.getText()) + 1;  
					txtcompscore.setText( String.valueOf(score));
				}
				else {
					int score = Integer.parseInt(txttie.getText()) + 1;  
					txttie.setText( String.valueOf(score));							
				}

				break;
			
			case "Paper":
				if (choice2 =="Rock") {
					int score = Integer.parseInt(txtscore.getText()) + 1;  
					txtscore.setText( String.valueOf(score));
				}
				else if (choice2 ==  "Scissors") {
					int score = Integer.parseInt(txtcompscore.getText()) + 1;  
					txtcompscore.setText( String.valueOf(score));							
				}
				else {
					int score = Integer.parseInt(txttie.getText()) + 1;  
					txttie.setText( String.valueOf(score));													
				}
				
				break;
			
			case "Scissors":
				if (choice2 =="Rock") {
					int score = Integer.parseInt(txtcompscore.getText()) + 1;  
					txtcompscore.setText( String.valueOf(score));							
				}
				else if (choice2 ==  "Paper") {
					int score = Integer.parseInt(txtscore.getText()) + 1;  
					txtscore.setText( String.valueOf(score));							
				}
				else {
					int score = Integer.parseInt(txttie.getText()) + 1;  
					txttie.setText( String.valueOf(score));							
				}
				
				break;				
		}
		
		if (txtcompscore.getText().equals("10" )){
			txtwins.setText ("You lost :( ");
			txttie.setText("0");
			txtcompscore.setText("0");
			txtscore.setText("0");
			
		}
		if ( txtscore.getText().equals("10")){
			txtwins.setText("You won!");
			txttie.setText("0");
			txtcompscore.setText("0");
			txtscore.setText("0");
		
		}
		if (txttie.getText().equals( "10")){
			txtwins.setText("Its a tie");
			txttie.setText("0");
			txtcompscore.setText("0");
			txtscore.setText("0");
		
		}

	}
} //end main
