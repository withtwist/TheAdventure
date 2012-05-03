package se.chalmers.kangaroo.view;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import se.chalmers.kangaroo.model.Position;

public class KangarooAnimation implements Animation {
	
	private Image sheet;
	private int widthPerFrame;
	private int height;
	private int tickMax;
	private int tick;
	private int currentFrame;
	private int frames = 3;
	
	public KangarooAnimation(String pathName, int width, int height, int tickMax) {
		sheet = Toolkit.getDefaultToolkit().getImage(pathName);
		currentFrame = 1;
		this.widthPerFrame = width;
		this.height = height;
		this.tickMax = tickMax;
		tick = 0;
	}
	@Override
	public void drawSprite(Graphics2D g, int x, int y) {
		if(tick==30) {
			tick = 0;
			currentFrame = (currentFrame%3)+1;
		}
		g.drawImage(sheet, x, y, x+widthPerFrame, y+widthPerFrame, currentFrame*widthPerFrame, currentFrame*height, (currentFrame*widthPerFrame)+widthPerFrame, (currentFrame*height)+height, null);
		tick++;
	}
}
