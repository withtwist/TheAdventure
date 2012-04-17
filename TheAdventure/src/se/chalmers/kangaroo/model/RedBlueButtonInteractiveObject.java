package se.chalmers.kangaroo.model;
/**
 * 
 * @author pavlov
 *
 */
public class RedBlueButtonInteractiveObject implements InteractiveObject {
	private boolean isRed;
	@Override
	public boolean isCollidable(int a) {
		//Right now, 88 is the tile-id for the red interactive tile
		if(a == 88){
			return isRed;
		}else if(a == 89){
			return !isRed;
		}else{
			return false;
		}
	}

}
