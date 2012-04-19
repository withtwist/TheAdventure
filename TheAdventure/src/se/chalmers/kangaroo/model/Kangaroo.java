package se.chalmers.kangaroo.model;

import java.awt.Polygon;

/**
 * This class represents the Kangaroo controlled by the player.
 * 
 * @author simonal
 * @modified by arvidk
 * 
 */
public class Kangaroo implements Movable {

	private Item item;
	private Position pos;
	
	private int verticalSpeed = 0;
	private int horizontalSpeed = 0;
	
	private Direction direction = Direction.DIRETION_NONE;
	
	private boolean enableDoubleJump = false;
	
	private boolean isJumping = false;
	private boolean isFalling = false;
	
	private Polygon kangarooPoly;

	/**
	 * The constructor for Kangaroo.
	 * 
	 * @param spawnPos
	 * @return
	 */
	public Kangaroo(Position spawnPos) {
		this.pos = spawnPos;
		int[] xcords = {pos.getX(),pos.getX()+31,pos.getX(),pos.getX()+31};
		int[] ycords = {pos.getY(),pos.getY(),pos.getY()+63,pos.getY()+63};
		kangarooPoly = new Polygon(xcords,ycords,4);
	}

	/**
	 * Returns the item currently in use of the Kangaroo.
	 * 
	 * @return currentItem
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * Returns the kangaroos polygon.
	 * @return
	 */
	public Polygon getPolygon() {
		return kangarooPoly;
	}

	/**
	 * Sets and if possible replaces the old item with a new one.
	 * 
	 * @param newItem
	 */
	public void setItem(Item newItem) {
		if(this.item != null) {
			this.item.onDrop(this);
		}
			this.item = newItem;
			this.item.onPickup(this);
	}
	/**
	 * Removes the current item on the kangaroo;
	 */
	public void removeItem() {
		this.item=  null;
	}
	/**
	 * Moves the Kangaroo with the specified delta-y and delta-x.
	 */
	public void setRelativePosition(int dx, int dy) {
		this.pos = new Position(pos.getX()+dx, pos.getY()+dy);
	}
	/**
	 * Moves the Kangaroo to the specified position.
	 * @param p
	 */
	public void setPosition(Position p) {
		this.pos = p;
	}
	/**
	 * Sets the direction that the Kangaroo is moving towards.
	 * @param d
	 */
	public void setDirection(Direction d) {
		this.direction = d;
	}
	/**
	 * Returns the vertical speed of the Kangaroo.
	 * @return
	 */
	public int getVerticalSpeed() {
		return verticalSpeed;
	}
	/**
	 * Returns the current position of the Kangaroo.
	 * @return
	 */
	public Position getPosition() {
		return pos;
	}
	/**
	 * Enables doublejump.
	 */
	public void enableDoubleJump() {
		this.enableDoubleJump = true;
	}
	/**
	 * Disables doublejump.
	 */
	public void disableDoubleJump() {
		this.enableDoubleJump = false;
	}
	public boolean isDoubleJumpEnabled() {
		return enableDoubleJump;
	}
	/**
	 * Makes the Kangaroo jump by setting its vertical speed.
	 */
	public void jump() {
		if(isJumping==false) {
			this.isJumping = true;
			this.isFalling = true;
			this.verticalSpeed = 1;		
		}

	}

	public void updateKangaroo() {
		this.move();
		

	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kangaroo other = (Kangaroo) obj;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kangaroo [pos=" + pos + "]";
	}

	@Override
	public void move() {
		this.setRelativePosition((int)horizontalSpeed, (int)verticalSpeed);
		System.out.println(pos);
		if(isFalling) {
			this.verticalSpeed -= 0.1;
	
		} if(direction == Direction.DIRECTION_EAST) {			
			horizontalSpeed += 1;
			
		} if(direction == Direction.DIRECTION_WEST) {			
			horizontalSpeed -= 1;
			
		} if(direction == Direction.DIRETION_NONE) {
			if (horizontalSpeed<0) {				
				horizontalSpeed += 0.1;						
			} else if (horizontalSpeed>0) {				
				horizontalSpeed -= 0.1;
			} 

		}
		
	}

}
