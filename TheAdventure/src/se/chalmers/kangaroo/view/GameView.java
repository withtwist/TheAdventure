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
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < model.getGameMap().getTileHeight(); i++)
			for(int j = 0; j < model.getGameMap().getTileWidth(); j++){
				ImageIcon img = new ImageIcon("../gfx/tiles/tile_"+
			model.getGameMap().getTile(i, j).getId()+".png");
				img.paintIcon(null, g, j*32, i*32);
			}
	}

}
