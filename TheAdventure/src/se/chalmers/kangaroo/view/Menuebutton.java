package se.chalmers.kangaroo.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * A class representing the buttons on the startingmenue.
 * @author twist3r
 *
 */
public class Menuebutton extends JLabel {
	/**
	 * The default constructor.
	 * @param imagepath
	 */
	public Menuebutton(String imagepath) {
		this.setIcon(new ImageIcon(imagepath));
		this.setAlignmentX(CENTER_ALIGNMENT);
		this.setAlignmentY(CENTER_ALIGNMENT);
		//this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(),(Border)(new BorderFactory.createEmptyBorder(10,10,10,10))));
		this.setVisible(true);
	}

}
