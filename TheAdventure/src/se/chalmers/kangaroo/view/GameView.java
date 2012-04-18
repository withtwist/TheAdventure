package se.chalmers.kangaroo.view;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import se.chalmers.kangaroo.model.GameModel;

/**
 * 
 * @author alburgh
 *
 */
public class GameView extends JPanelWithBackground{
	private GameModel model;
	
	public GameView(String imagepath, GameModel gm) {
		super(imagepath);
		model = gm;
	}
	
	public void update(){
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon img = new ImageIcon("../gfx/tiles/tile_"+1+".png");
		img.paintIcon(null, g, 0, 0);
		
		img = new ImageIcon("../gfx/tiles/tile_" +2+".png");
		img.paintIcon(null, g, 32, 32);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImageIcon img = new ImageIcon("../gfx/tiles/tile_" +1+".png");
		img.paintIcon(null, g, 0, 0);
		img = new ImageIcon("../gfx/tiles/tile_" +1+".png");
		img.paintIcon(null, g, 32, 32);
	}

}
