package se.chalmers.kangaroo.view;

import java.awt.Graphics2D;

public class KangarooAnimation implements Animation {
	
	private String pathName;
	private int widthPerFrame;
	private int height;
	
	public KangarooAnimation(String pathName, int width, int height, int tick) {
		this.pathName = pathName;
		this.widthPerFrame = width;
		this.height = height;
	}
	@Override
	public void drawSprite(Graphics2D g) {
		
		
	}

}
