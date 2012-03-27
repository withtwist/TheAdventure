package se.chalmers.kangaroo.view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Menuebutton extends JLabel {
	
	public Menuebutton(String imagepath) {
		this.setIcon(new ImageIcon(imagepath));
		this.setAlignmentX(CENTER_ALIGNMENT);
		this.setAlignmentY(CENTER_ALIGNMENT);
		//this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(),(Border)(new BorderFactory.createEmptyBorder(10,10,10,10))));
		this.setVisible(true);
	}

}
