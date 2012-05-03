package se.chalmers.kangaroo.model.item;

import se.chalmers.kangaroo.model.Item;
import se.chalmers.kangaroo.model.Kangaroo;
import se.chalmers.kangaroo.model.Position;

/**
 * The item with the doublejump-effect.
 * 
 * @author simonal
 * 
 */
public class DoubleJumpItem implements Item {

	private Position pos;
	private int id;

	public DoubleJumpItem(int id, int x, int y) {
		this.id = id;
		this.pos = new Position(x, y);
	}

	@Override
	public void onPickup(Kangaroo k) {
		k.enableDoubleJump();
	}

	@Override
	public void onDrop(Kangaroo k) {
		k.disableDoubleJump();
		k.removeItem();

	}

	@Override
	public void onUse(Kangaroo k) {
		//

	}

	@Override
	public Position getPosition() {
		return pos;
	}

	@Override
	public int getId() {
		return id;
	}

}
