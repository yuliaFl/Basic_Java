/*
 * Yulia Flenova
 * VERSION 1.
 * May 24, 2017
 * Pokemon game, teletubie trying to run away from pokemon 
 */
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pokemongame { //start class
	static int X = 0;
	static int Y = 0;
	static int X2 = 0;
	static int Y2 = 0;
	int  direction = 1; //1 = right, 2 = left
	
	private JFrame frame;
	Timer timePoke;
	
	final int GAME_PLAYING = 0;
	final int GAME_LOSE = 1;
	private int gameStatus = GAME_PLAYING;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //start main
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					pokemongame window = new pokemongame();
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

	public pokemongame(){
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 959, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Rectangle player = new Rectangle(X, Y, 120, 240);
		Rectangle pokemon = new Rectangle(X2, Y2, 140, 150);
		
		JLabel lblTeletubbie = new JLabel(""); //Teletubbie image
		
		lblTeletubbie.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTeletubbie.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/teletubie.png")));
		lblTeletubbie.setBounds(111, 268, 169, 280);
		frame.getContentPane().add(lblTeletubbie);
		
		X = lblTeletubbie.getX();
		 Y = lblTeletubbie.getY();
		
		 JLabel lblPokemon = new JLabel("");
			lblPokemon.setIcon(new ImageIcon(pokemongame.class.getResource("/images/Yellow_Front.png")));
			lblPokemon.setBounds(525, 329, 184, 200);
			frame.getContentPane().add(lblPokemon);
			X2 = lblPokemon.getX();
			Y2 = lblPokemon.getY();
			
		JButton btnUp = new JButton("UP");
		btnUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Y>5) {
					Y-=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Back.png")));
				}
			
			}
		});
		btnUp.setBounds(151, 21, 117, 29);
		frame.getContentPane().add(btnUp);
		
		JButton btnDown = new JButton("DOWN");
		btnDown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					if (Y<300) {
						Y+=10;
						lblTeletubbie.setLocation(X, Y);
						player.setLocation(X, Y);
						lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/teletubie.png")));
					}
			}
		});
		btnDown.setBounds(151, 134, 117, 29);
		frame.getContentPane().add(btnDown);
		
		JButton btnRight = new JButton("RIGHT");
		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (X<800) {
					X+=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Right.png")));
				}
		
			}
		});
		btnRight.setBounds(284, 74, 117, 29);
		frame.getContentPane().add(btnRight);
		
		JButton btnLeft = new JButton("LEFT");
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (X>0) {
					X-=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Left.png")));
				}
			}
		});
		btnLeft.setBounds(22, 74, 117, 29);
		frame.getContentPane().add(btnLeft);
		
		JButton btnUpright = new JButton("UP/ RIGHT");
		btnUpright.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (X<800 && Y>0) {
					Y-=10;
					X+=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Back.png")));
				}
				
			}
		});
		btnUpright.setBounds(284, 21, 117, 29);
		frame.getContentPane().add(btnUpright);
		
		JButton btnUpLeft = new JButton("UP/ LEFT");
		btnUpLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Y>0 && X>0) {
				    X-=10; 
					Y-=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Back.png")));
				}
			}
		});
		btnUpLeft.setBounds(22, 21, 117, 29);
		frame.getContentPane().add(btnUpLeft);
		
		JButton btnDownLeft = new JButton("DOWN/ LEFT");
		btnDownLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (X>0 && Y<300) {
					Y+=10; 
					X-=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Left.png")));
				}
			}
		});
		btnDownLeft.setBounds(22, 134, 117, 29);
		frame.getContentPane().add(btnDownLeft);
		
		JButton btnDownRight = new JButton("DOWN/ RIGHT"); 
		btnDownRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Y<300 && X<800) {
					X+=10;
					Y+=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					lblTeletubbie.setIcon(new ImageIcon(pokemongame.class.getResource("/teletubbie/Red_Right.png")));
				}
		
			}
		});
		btnDownRight.setBounds(284, 134, 117, 29);
		frame.getContentPane().add(btnDownRight);
		
		
		ActionListener runPoke = new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0){
				if (X2 > 740) {
					direction = 2;
				} else if (X2 < 10) {
					direction = 1;
				}
				
				if (direction == 1) {
					X2+=10;
					lblPokemon.setLocation(X2, Y2);//right
					pokemon.setLocation(X2, Y2);
					lblPokemon.setIcon(new ImageIcon(pokemongame.class.getResource("/images/Yellow_Right.png")));
				} else if (direction == 2) { //left
					X2-=10;
					lblPokemon.setLocation(X2, Y2);
					pokemon.setLocation(X2, Y2); 
					lblPokemon.setIcon(new ImageIcon(pokemongame.class.getResource("/images/Yellow_Left.gif")));
				}
				
				 if (pokemon.intersects(player)){
						gameStatus = GAME_LOSE;
						timePoke.stop();
						JOptionPane.showMessageDialog(frame,  "GAME OVER");
				 }
			}
		};
	
		timePoke = new Timer(100, runPoke);
		timePoke.start();
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon(pokemongame.class.getResource("/background/fable_2_10_l.jpg")));
		lblBackGround.setBounds(0, 0, 961, 580);
		frame.getContentPane().add(lblBackGround);
		
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		frame.addKeyListener(new KeyAdapter() { //controling with keys 
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					System.out.println("Left");
					X-=10;
					lblTeletubbie.setLocation(X, Y);
					player.setLocation(X, Y);
					break;
				case KeyEvent.VK_RIGHT:
				X+=10;
				lblTeletubbie.setLocation(X, Y);
				player.setLocation(X, Y);
				break;
				case KeyEvent.VK_UP:
				Y-=10;
				lblTeletubbie.setLocation(X, Y);
				player.setLocation(X, Y);
				break;
				case KeyEvent.VK_DOWN:
				Y+=10;
				lblTeletubbie.setLocation(X, Y);
				player.setLocation(X, Y);
				break;	
				}
			}
		});
		
	}//end main
}// end class
