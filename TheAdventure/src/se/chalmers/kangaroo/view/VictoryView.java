package se.chalmers.kangaroo.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import se.chalmers.kangaroo.model.GameModel;

public class VictoryView extends JPanelWithBackground implements MouseListener{

	Menuebutton nextlevel;
	
	public VictoryView(String imagepath, GameModel gm) {
		super(imagepath);
		
		nextlevel = new Menuebutton("resources/images/nextlevel.png");
		
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		this.setSize(1024, 576);
		this.add(Box.createVerticalGlue());
		this.add(new Menuebutton("resources/images/victory_logo.png"));
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(new Menuebutton("resources/images/congratulations.png"));
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(new JLabel("Deaths: " + gm.getDeathCount()));
		this.add(Box.createVerticalGlue());
		this.add(new JLabel("Time: " + gm.getTime()));
		this.add(new Menuebutton("resources/images/congratulations.png"));
		this.add(Box.createVerticalGlue());
		this.add(new Menuebutton("resources/images/nextlevel.png"));
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		
		nextlevel.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Empty method
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == nextlevel)
			nextlevel.setIcon(new ImageIcon(
					"resources/images/nextlevel_onHover.png"));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == nextlevel)
			nextlevel.setIcon(new ImageIcon(
					"resources/images/nextlevel.png"));
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == nextlevel)
			nextlevel.setIcon(new ImageIcon(
					"resources/images/nextlevel_onSelect.png"));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == nextlevel)
			nextlevel.setIcon(new ImageIcon(
					"resources/images/nextlevel.png"));
		
		//Start the next level
		
	}

}
