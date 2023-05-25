import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Egg {
	public JLabel egglabel;
	final int LEFT_TOP_CHICKEN = 1;
	final int LEFT_BOTTOM_CHICKEN = 2;
	final int RIGHT_TOP_CHICKEN = 3;
	final int RIGHT_BOTTOM_CHICKEN = 4;
	
	public Boolean valid = true;	
	int Chicken = LEFT_TOP_CHICKEN;
	
	public JLabel Init() {
		egglabel = new JLabel("");
		egglabel.setIcon(new ImageIcon(summetive.class.getResource("/images/eggUp.png")));
		
		Random rand = new Random(); 
		Chicken = rand.nextInt(4)+1; //choose a random chicken
		if (Chicken == LEFT_BOTTOM_CHICKEN) {
			egglabel.setBounds(15, 330, 56, 91);
		}
		if (Chicken == LEFT_TOP_CHICKEN) {
			egglabel.setBounds(22, 136, 56, 91);
		 }
		if (Chicken == RIGHT_BOTTOM_CHICKEN) {
			egglabel.setBounds(736, 330, 56, 91);
		}
		if (Chicken == 	RIGHT_TOP_CHICKEN) {
			egglabel.setBounds(720, 150, 56, 91);
		 }

		return egglabel;
	}
	
	public void moveit() {
		if (Chicken == LEFT_BOTTOM_CHICKEN || Chicken == LEFT_TOP_CHICKEN) {
			Rectangle bounds = egglabel.getBounds();
			egglabel.setBounds(bounds.x + 30, bounds.y + 5, bounds.width, bounds.height); //direction for how the egg travels from the left side
			 
			if (bounds.x + 30 > 230)
				valid = false;
		}
		
		if (Chicken == RIGHT_BOTTOM_CHICKEN || Chicken == RIGHT_TOP_CHICKEN) {
			Rectangle bounds = egglabel.getBounds();
			egglabel.setBounds(bounds.x - 30, bounds.y+5, bounds.width, bounds.height); //direction for how the egg travels from the right side
			
			if (bounds.x - 30 < 550)
				valid = false;
		}
	}
}
