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
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 20; j++){
				ImageIcon img = new ImageIcon("../gfx/tiles/tile_"+
			model.getGameMap().getTile(i, j).getId()+".png");
				img.paintIcon(null, g, 0, 0);
			}
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
