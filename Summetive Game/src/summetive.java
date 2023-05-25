/*
 *Yulia Flenova 
 * Version 1.0
 * May 29,2017
 * Hurry Hurry game, wolf is trying to collect eggs from 4 chickens 
 */
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
import java.awt.Color;

public class summetive { //begin class
	static int X = 0;
	static int Y = 0;
	static int X2 = 0;
	static int Y2 = 0;
	static int timercount=1000;
	
	int score = 0;

	private JFrame frame;
	JLabel scoreBox;
	JLabel chickDeduct1;
	JLabel chickDeduct2;
	JLabel chickDeduct3;
	JLabel volk;
	Timer timeVolk;
	Timer timeEgg;
	
	
	final int GAME_INTRO = 0;
	final int GAME_PLAYING = 1;
	final int GAME_LOSE = 2;
	final int GAME_LOADING = 3;
	final int GAME_OPENING = 4;
	private int gameStatus = GAME_INTRO;
	private ArrayList<Egg> eggs = new ArrayList<Egg>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //begin main 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summetive window = new summetive();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public summetive() {
		opening();
	}
	
	int fail=0; //fail for when egg doesn't touch the wolf  
	
	ActionListener eggListener = new ActionListener() {
		@Override 
		public void actionPerformed(ActionEvent arg0) {
			int i = 0;
			while (i < eggs.size()) {
				eggs.get(i).moveit();
				Rectangle volkBounds = new Rectangle(X, Y+172, 216, 120);
				Rectangle eggBounds = eggs.get(i).egglabel.getBounds();

				if (eggBounds.intersects(volkBounds)){   //if egg and wolf meet increase score 
					score++;
					scoreBox.setText( String.valueOf(score));	
					frame.getContentPane().remove(eggs.get(i).egglabel); // remove the egg label 
					eggs.remove(i);
					continue;
				}
				
				if (eggs.get(i).valid == false) { // if egg doesn't meet the wolf deduct score 
					score--;
					scoreBox.setText( String.valueOf(score));	
					fail++;  //increase fail 
					frame.getContentPane().remove(eggs.get(i).egglabel); //remove egg
					eggs.remove(i);	
					
					if (fail==1){ // on the first fail show first chicken  
						chickDeduct1.setVisible(true);
					}

					if (fail==2){// on the second fail show second chicken  
						chickDeduct2.setVisible(true);
					}
					if (fail==3){// on the third fail show third chicken  
						chickDeduct3.setVisible(true);
					}
					continue;
				}
				i++; //make another egg
			}
			
			
			Random rand = new Random(); 
			int time = rand.nextInt(10);

			if (time == 1 || eggs.size() == 0) {
				Egg egg = new Egg();
				frame.getContentPane().add(egg.Init(), 0);
				eggs.add(egg);

			}
			
			if (chickDeduct1.isVisible() & chickDeduct2.isVisible() & chickDeduct3.isVisible()){  // if all chickens appear game lost 
				gameOver.setIcon(new ImageIcon(summetive.class.getResource("/images/gameOver.png")));
				frame.getContentPane().remove(eggs.get(i).egglabel);
				eggs.remove(i);	   // remove egg
				volk.setVisible(false); // remove wolf
				
			}
			
			if ((score % 10 == 0)&&(score>0 )){ // every 10 score inscrease the speed 
				if (timeEgg.getInitialDelay() >= 100) {
					timercount -=50;
					//System.out.print(timeEgg.getDelay());
					timeEgg.setDelay(timercount);
					
				}
				
			}
		}
	};
	
	/**
	 *  opening
	 */
	private void opening() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel opening = new JLabel("");
		opening.setIcon(new ImageIcon(summetive.class.getResource("/images/opening2.png")));
		opening.setBounds(0, -21, 818, 629);
		frame.getContentPane().add(opening);
		
		JButton openingbutton = new JButton("");
		openingbutton.setBounds(0, 0, 800, 592);
		frame.getContentPane().add(openingbutton);
		frame.setVisible(true);
        openingbutton.addActionListener(new ActionListener() { // if pressed go to home pg
		public void actionPerformed(ActionEvent e) {
			initializeHome();
		
		
		}
  });
		
	}
	
	/**
	 *  initialize startGame
	 */
	private void startGame() {  //controlling game 
		gameStatus = GAME_PLAYING;
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		Rectangle Egg = new Rectangle(X2, Y2, 56, 91);
			
		volk = new JLabel("");
		volk.setIcon(new ImageIcon(summetive.class.getResource("/images/Volk_Right1.png")));
		volk.setBounds(361, 261, 216, 314);
		frame.getContentPane().add(volk);
		volk.setVisible(true);
		
		timeEgg = new Timer(timercount, eggListener);  //timer for egg
		timeEgg.start();
		
		JLabel scoreLabel = new JLabel("Score:");
		scoreLabel.setFont(new Font("Yuppy TC", Font.BOLD | Font.ITALIC, 50));
		scoreLabel.setBounds(37, 6, 153, 40);
		frame.getContentPane().add(scoreLabel);
		
		scoreBox = new JLabel("0");
		scoreBox.setFont(new Font("Yuppy TC", Font.BOLD | Font.ITALIC, 45));
		scoreBox.setBounds(187, 6, 115, 41);
		frame.getContentPane().add(scoreBox);
		
		chickDeduct1 = new JLabel("");
		chickDeduct1.setIcon(new ImageIcon(summetive.class.getResource("/images/chick.png")));
		chickDeduct1.setBounds(361, 6, 95, 93);
		frame.getContentPane().add(chickDeduct1);
		chickDeduct1.setVisible(false);
		
		chickDeduct2 = new JLabel("");
		chickDeduct2.setIcon(new ImageIcon(summetive.class.getResource("/images/chick.png")));
		chickDeduct2.setBounds(448, 6, 95, 93);
		frame.getContentPane().add(chickDeduct2);
		chickDeduct2.setVisible(false);
		
		chickDeduct3 = new JLabel("");
		chickDeduct3.setIcon(new ImageIcon(summetive.class.getResource("/images/chick.png")));
		chickDeduct3.setBounds(543, 6, 95, 93);
		frame.getContentPane().add(chickDeduct3);
		chickDeduct3.setVisible(false);
		
		gameOver = new JLabel("");
		gameOver.setBounds(122, 149, 573, 338);
		frame.getContentPane().add(gameOver);
		
		JLabel game = new JLabel("");
		game.setBounds(0, 0, 800, 592);
		frame.getContentPane().add(game);		
		game.setIcon(new ImageIcon(summetive.class.getResource("/images/Game.png")));

		X = volk.getX();
		Y = volk.getY();
		 
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		frame.addKeyListener(new KeyAdapter() { //controlling with keys 
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (X>195){
						X-=30;
						volk.setIcon(new ImageIcon(summetive.class.getResource("/images/Volk_Left1.png")));
						volk.setLocation(X, Y);
						Egg.setLocation(X2, Y2);
					}
				break;
				case KeyEvent.VK_RIGHT:
					if(X<450){
						X+=30;
						volk.setIcon(new ImageIcon(summetive.class.getResource("/images/Volk_Right1.png")));
						volk.setLocation(X, Y);
						Egg.setLocation(X2, Y2);
					}
				break;
				case KeyEvent.VK_UP:
					if (Y>85){
						Y-=30;
						Egg.setLocation(X2, Y2);
						volk.setLocation(X, Y);
					}
				break;
				case KeyEvent.VK_DOWN:
					if(Y<250){
						Y+=30;
						volk.setLocation(X, Y);
						Egg.setLocation(X2, Y2);
					}
				break;
				}
			}
		});
			
	};
			
	ActionListener loading = new ActionListener() {
		@Override 
		public void actionPerformed(ActionEvent arg0) {
			if (gameStatus == GAME_LOADING) { // if the frame is loading, go to game
				startGame();
				timeVolk.stop();
			}
		}
	};
	private JLabel gameOver;

	/** Initialize Loading
	 * 
	 */
	private void initializeLoading() {  //controlling loading pg
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel loadingLabel = new JLabel("");
		loadingLabel.setBounds(-88, -12, 987, 618);
		frame.getContentPane().add(loadingLabel);
		
		loadingLabel.setIcon(new ImageIcon(summetive.class.getResource("/images/Loading.png")));
		
		frame.setVisible(true);
		gameStatus = GAME_LOADING;
		
		timeVolk = new Timer(1000, loading);  //timer for loading pg 
		timeVolk.start();
	}

	/**
	 * Initialize Home
	 */
	private void initializeHome() {   //controlling home pg
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		JButton startButton = new JButton("Start game");
		startButton.setForeground(SystemColor.windowText);
		startButton.setBackground(SystemColor.window);
		startButton.setFont(new Font("Papyrus", Font.ITALIC, 80));
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initializeLoading();
			}
		});
		startButton.setBounds(352, 215, 414, 106);
		frame.getContentPane().add(startButton);
		
		JButton instructionsButton = new JButton("Instructions ");
		instructionsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(  frame,
					    "Hey there! \n In this game you are a wolf who is trying to collect eggs from 4 chickens, \n Each time you successfully catch an egg you receives a point, \n After a certain amount of points, the speed of the eggs rolling down will increase  \n If you dont catch catch an egg a chick will appear, up to 3 chicks can appear until the game shuts down because you lost. " );
				
			}
		});
		instructionsButton.setFont(new Font("Papyrus", Font.ITALIC, 72));
		instructionsButton.setBounds(352, 370, 414, 106);
		frame.getContentPane().add(instructionsButton);
		
		JTextArea enterName = new JTextArea();
		enterName.setFont(new Font("Yuppy TC", Font.BOLD | Font.ITALIC, 35));
		enterName.setBackground(Color.WHITE);
		enterName.setBounds(352, 125, 215, 45);
		frame.getContentPane().add(enterName);
		
		JLabel nameLabel = new JLabel("ENTER YOUR NAME");
		nameLabel.setBackground(Color.LIGHT_GRAY);
		nameLabel.setForeground(new Color(255, 0, 255));
		nameLabel.setFont(new Font("Yuppy TC", Font.BOLD | Font.ITALIC, 45));
		nameLabel.setBounds(335, 56, 431, 45);
		frame.getContentPane().add(nameLabel);
		
		
		JLabel mainLabel = new JLabel("");
		mainLabel.setIcon(new ImageIcon(summetive.class.getResource("/images/Main.png")));
		mainLabel.setBounds(0, 0, 854, 600);
		frame.getContentPane().add(mainLabel);
		frame.setVisible(true);
	}
}