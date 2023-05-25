import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class engAssignment {
	private JFrame frame;
	private JTextField txtnameenter;
	private JTextField txtnameprint;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					engAssignment window = new engAssignment();
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
	public engAssignment() {
		mainpage();
		// inroduction();
		
		//cities();
		//education();
		//tourism();
		//safety();
		//civil();
		
		//citiesguide();
		//educationguide();
		//tourismguide();
		//safetyguide();
		//civilquide();
		
		//workcited();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void mainpage () {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnIntroduction = new JButton("Introduction ");
		btnIntroduction.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnIntroduction.setBounds(103, 107, 170, 74);
		frame.getContentPane().add(btnIntroduction);
		btnIntroduction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inroduction();
		}
		});
		
		JButton btnWorkCitied = new JButton("Work Citied");
		btnWorkCitied.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnWorkCitied.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				workcited();
			}
		});
		btnWorkCitied.setBounds(216, 409, 170, 74);
		frame.getContentPane().add(btnWorkCitied);
		
		JButton btnCities = new JButton("Cities");
		btnCities.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnCities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cities();
			}
		});
		btnCities.setBounds(329, 107, 170, 74);
		frame.getContentPane().add(btnCities);
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(357, 81, 507, 492);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/catfront.png")));
		frame.getContentPane().add(lblcat);
		
		JButton btnEducation = new JButton("Education");
		btnEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				education();
			}
		});
		btnEducation.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnEducation.setBounds(103, 206, 170, 74);
		frame.getContentPane().add(btnEducation);
		
		JButton btnEmergency = new JButton("Emergency");
		btnEmergency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				safety();
			}
		});
		btnEmergency.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnEmergency.setBounds(329, 206, 170, 74);
		frame.getContentPane().add(btnEmergency);
		
		JButton btnTourism = new JButton("Tourism");
		btnTourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tourism();
			}
		});
		btnTourism.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnTourism.setBounds(103, 310, 170, 74);
		frame.getContentPane().add(btnTourism);
		
		JButton btnCivilCommunication = new JButton("Civil communication");
		btnCivilCommunication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				civil();
			}
		});
		btnCivilCommunication.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnCivilCommunication.setBounds(329, 312, 170, 74);
		frame.getContentPane().add(btnCivilCommunication);
		
		JLabel main = new JLabel("");
		main.setIcon(new ImageIcon(engAssignment.class.getResource("/images/main.jpg")));
		main.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(main);
	}
	
	private void inroduction() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(317, 247, 501, 306);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/catshook.png")));
		frame.getContentPane().add(lblcat);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		
		JLabel lblgreating = new JLabel("Oh, hey there! Welcome to my world,");
		lblgreating.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lblgreating.setForeground(Color.WHITE);
		lblgreating.setBounds(20, 34, 426, 35);
		frame.getContentPane().add(lblgreating);
		
		JLabel lblEnterName = new JLabel("Enter name-");
		lblEnterName.setForeground(SystemColor.text);
		lblEnterName.setBounds(30, 81, 91, 16);
		frame.getContentPane().add(lblEnterName);
		
		txtnameenter = new JTextField();
		txtnameenter.setBounds(112, 76, 108, 26);
		frame.getContentPane().add(txtnameenter);
		txtnameenter.setColumns(10);
				
		txtnameprint = new JTextField();
		txtnameprint.setBounds(218, 114, 108, 26);
		frame.getContentPane().add(txtnameprint);
		txtnameprint.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String name =txtnameenter.getText();
				 txtnameprint.setText(name);
			}
		});
		btnSave.setBounds(218, 76, 68, 29);
		frame.getContentPane().add(btnSave);
		
		JLabel lbl1 = new JLabel("Nice to meet you                   , ");
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lbl1.setBounds(10, 114, 359, 21);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("in this application you can explore ");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lbl2.setBounds(346, 109, 420, 29);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("interesting information of the benefits of having free wifi in the ");
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lbl3.setBounds(10, 147, 748, 26);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("cities. Having free internet access around cities will benefit everyones");
		lbl4.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lbl4.setForeground(Color.WHITE);
		lbl4.setBounds(10, 174, 808, 29);
		frame.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("lives for the greater good.");
		lbl5.setForeground(Color.WHITE);
		lbl5.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		lbl5.setBounds(10, 200, 366, 29);
		frame.getContentPane().add(lbl5);
		
		JButton btnTour = new JButton("Click here for a tour");
		btnTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				citiesguide();
			}
		});
		btnTour.setBounds(20, 517, 164, 52);
		frame.getContentPane().add(btnTour);
		
		JLabel intromain = new JLabel("");
		intromain.setBackground(Color.WHITE);
		intromain.setFont(new Font("Lucida Grande", Font.ITALIC, 23));
		intromain.setForeground(SystemColor.text);
		intromain.setIcon(new ImageIcon(engAssignment.class.getResource("/images/into.jpg")));
		intromain.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(intromain);
	
	}

	private void cities() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(0, 153, 501, 439);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/catfrontside.png")));
		frame.getContentPane().add(lblcat);
		
		JLabel cities = new JLabel("");
		cities.setIcon(new ImageIcon(engAssignment.class.getResource("/images/cities.jpg")));
		cities.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(cities);
		
	}
	
	private void education() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		
		JLabel education = new JLabel("");
		education.setForeground(SystemColor.text);
		education.setIcon(new ImageIcon(engAssignment.class.getResource("/images/education.jpg")));
		education.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(education);
	}
	
	private void safety () {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(0, 76, 501, 439);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/catscared.png")));
		frame.getContentPane().add(lblcat);
		
		JLabel safety= new JLabel("");
		safety.setForeground(SystemColor.text);
		safety.setIcon(new ImageIcon(engAssignment.class.getResource("/images/safety.jpg")));
		safety.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(safety);
	}
	
	
	private void tourism() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});

		JLabel tourism= new JLabel("");
		tourism.setForeground(SystemColor.text);
		tourism.setIcon(new ImageIcon(engAssignment.class.getResource("/images/tourism.jpg")));
		tourism.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(tourism);
		
	}
	
	
	private void civil() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});

		JLabel tourism= new JLabel("");
		tourism.setForeground(SystemColor.text);
		tourism.setIcon(new ImageIcon(engAssignment.class.getResource("/images/civil.jpg")));
		tourism.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(tourism);
		
	}
	
	private void tourismguide() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnnext = new JButton("next");
		btnnext.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnnext); 
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				safetyguide();
			}
		});
		
		JButton btnEndTour = new JButton("End tour");
		btnEndTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		btnEndTour.setBounds(22, 545, 117, 29);
		frame.getContentPane().add(btnEndTour);
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(0, 153, 501, 439);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/cattalk.png")));
		frame.getContentPane().add(lblcat);

		JLabel tourismguide= new JLabel("");
		tourismguide.setForeground(SystemColor.text);
		tourismguide.setIcon(new ImageIcon(engAssignment.class.getResource("/images/tourism.jpg")));
		tourismguide.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(tourismguide);
		
	}
	
	private void citiesguide() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnEndTour = new JButton("End tour");
		btnEndTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		btnEndTour.setBounds(22, 545, 117, 29);
		frame.getContentPane().add(btnEndTour);
		
		JButton btnnext = new JButton("Next");
		btnnext.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnnext); 
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tourismguide();
			}
		});
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(0, 153, 501, 439);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/cattalk.png")));
		frame.getContentPane().add(lblcat);
		
		
		JLabel lblcitiesguide = new JLabel("");
		lblcitiesguide.setIcon(new ImageIcon(engAssignment.class.getResource("/images/cities.jpg")));
		lblcitiesguide.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(lblcitiesguide);
		
	}
	
	private void safetyguide() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnEndTour = new JButton("End tour");
		btnEndTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		btnEndTour.setBounds(22, 545, 117, 29);
		frame.getContentPane().add(btnEndTour);
		
		JButton btnnext = new JButton("Next");
		btnnext.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnnext); 
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				educationguide();
			}
		});
		
		JLabel lblcat = new JLabel("");
		lblcat.setBounds(0, 76, 501, 439);
		lblcat.setIcon(new ImageIcon(engAssignment.class.getResource("/images/cattalk.png")));
		frame.getContentPane().add(lblcat);
		
		JLabel safety= new JLabel("");
		safety.setForeground(SystemColor.text);
		safety.setIcon(new ImageIcon(engAssignment.class.getResource("/images/safety.jpg")));
		safety.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(safety);
	}
	
	private void civilguide() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JButton btnend = new JButton("End tour");
		btnend.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnend); 
		btnend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});

		JLabel tourism= new JLabel("");
		tourism.setForeground(SystemColor.text);
		tourism.setIcon(new ImageIcon(engAssignment.class.getResource("/images/civil.jpg")));
		tourism.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(tourism);
		
	}
	
	private void educationguide() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnEndTour = new JButton("End tour");
		btnEndTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		btnEndTour.setBounds(22, 545, 117, 29);
		frame.getContentPane().add(btnEndTour);
		
		JButton btnBack = new JButton("Next");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				civilguide();
			}
		});
	
		JLabel education = new JLabel("");
		education.setForeground(SystemColor.text);
		education.setIcon(new ImageIcon(engAssignment.class.getResource("/images/education.jpg")));
		education.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(education);
	}
	
	
	private void workcited() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(663, 545, 117, 29);
		frame.getContentPane().add(btnBack); 
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage();
			}
		});
		/*
		JLabel workcitedmain = new JLabel("");
		workcitedmain.setIcon(new ImageIcon(engAssignment.class.getResource("/images/main.jpg")));
		workcitedmain.setBounds(0, 0, 818, 592);
		frame.getContentPane().add(workcitedmain);
*/
	}
}
