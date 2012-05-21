


import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.kangaroo.model.GameMap;
import se.chalmers.kangaroo.model.iobject.RedBlueButton;
import se.chalmers.kangaroo.model.utils.Position;


public class RedBlueButtonTest {
	private Position p = new Position(2, 2);
	private int id = 71;
	private GameMap gm = new GameMap("1");
	
	@Test
	public void testIsCollidable() {
		RedBlueButton rb = new RedBlueButton(p, id, gm);
		assertTrue(rb.isCollidable('a'));
	}
	
	@Test
	public void testGetChangedId() {
		RedBlueButton rb = new RedBlueButton(p, id, gm);
		assertTrue(rb.getChangedId(id) == 72);
	}
	
	@Test
	public void testGetPosition() {
		RedBlueButton rb = new RedBlueButton(p, id, gm);
		assertTrue(rb.getPosition().equals(new Position(2, 2)));
	}
	
	@Test
	public void testGetId(){
		RedBlueButton rb = new RedBlueButton(p, id, gm);
		assertTrue(rb.getId() == 71);
	}
	
	@Test
	public void testChangeId() {
		RedBlueButton rb = new RedBlueButton(p, id, gm);
		rb.changeId();
		assertTrue(id == 72);
	}
}
