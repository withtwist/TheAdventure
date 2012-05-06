package se.chalmers.kangaroo.view;

import se.chalmers.kangaroo.model.Creature;


public class AnimationFactory {
	
	public AnimationFactory(){
		
	}
	
	public Animation getAnimation(Creature c){
		switch(c.getId()){
		case 111:
			return new CrabAnimation(c);
//		case 112:
//			return new TurtleCreature(p);
		case 113:
			return new BlackAndWhiteAnimation(c);
//		case 114:
//			return new BullCreature(p);
//		case 115:
//			return new SumoCreature(p);
		default:
			return null;
		
		}
	}
}
