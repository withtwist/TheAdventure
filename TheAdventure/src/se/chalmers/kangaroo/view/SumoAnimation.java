package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import se.chalmers.kangaroo.model.creatures.Creature;
import se.chalmers.kangaroo.model.creatures.SumoCreature;
import se.chalmers.kangaroo.model.utils.Direction;

public class SumoAnimation implements Animation{
	private SumoCreature sumo;
	private int width;
	private int height;
	private Image sheet;
	private int tick;
	private int currentSprite;
	
	public SumoAnimation(Creature c){
		this.sumo = (SumoCreature)c;
		this.width = 64;
		this.height = 64;
		this.sheet = Toolkit.getDefaultToolkit().getImage("/resources/sheet/sumo_64x64.png");
		this.tick = 0;
		this.currentSprite = 0;
	}
	@Override
	public void drawSprite(Graphics g, int x, int y) {
		if(sumo.isStomping()){
			tick++;
			currentSprite = (sumo.getDirection() == Direction.DIRECTION_EAST) ? 4 : 0;
			if(tick == 6)
				currentSprite++;
			else if(tick == 12)
				currentSprite++;
			else if(tick == 18)
				currentSprite++;
			else if(tick == 138)
				currentSprite++;
			else if(tick == 139)
				currentSprite--;
			else if(tick == 140)
				currentSprite--;
			else if(tick == 141)
				currentSprite--;
		}else{
			tick = 0;
			currentSprite = 0;
		}
		
		
	}
	
}
