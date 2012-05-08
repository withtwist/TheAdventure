package se.chalmers.kangaroo.view;

import se.chalmers.kangaroo.model.creatures.Creature;


public class AnimationFactory {
	
	public AnimationFactory(){
		
	}
	/**
	 * Creates an animation for a creature based on the ID of the creature. 
	 * @param c, the creature that will be given an animation. 
	 * @return, the created animation for the creature
	 */
	public Animation getAnimation(Creature c){
		switch(c.getId()){
		case 111:
			return new CrabAnimation(c);
//		case 112: activate when turtlecreature is complete.
//			return new TurtleAnimation(c);
		case 113:
			return new BlackAndWhiteAnimation(c);
//		case 114: activate when bullcreature is complete.
//			return new BullAnimation(c);
		case 115:
			return new SumoAnimation(c);
		default:
			return null;
		
		}
	}
}
