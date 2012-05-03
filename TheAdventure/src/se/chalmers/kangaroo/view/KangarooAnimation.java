package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class KangarooAnimation implements Animation {
	
	private Image sheet;
	private int widthPerFrame;
	private int height;
	private int tick;
	private int currentFrame;

	
	public KangarooAnimation(String pathName, int width, int height) {
		sheet = Toolkit.getDefaultToolkit().getImage(pathName);
		currentFrame = 1;
		this.widthPerFrame = width;
		this.height = height;

		tick = 0;
	}
	@Override
	public void drawSprite(Graphics g, int x, int y, JPanelWithBackground jpg) {
		if(tick==30) {
			tick = 0;
			currentFrame = (currentFrame%3)+1;
		}
		System.out.println("hej");
		g.drawImage(sheet, x, y, jpg, x+widthPerFrame, y+widthPerFrame, currentFrame*widthPerFrame, currentFrame*height, (currentFrame*widthPerFrame)+widthPerFrame, (currentFrame*height)+height, null);
		tick++;

	}
	@Override
	public void drawSprite(Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
