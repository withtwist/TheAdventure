import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.creatures.SmurfCreature;
import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;


public class SmurfCreatureTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsKillable() {
		SmurfCreature c = new SmurfCreature(new Position(42,1337));
		assertTrue(!c.isKillable());
	}
	
	@Test
	public void testMove() {
		SmurfCreature c = new SmurfCreature(new Position(1,1));
		SmurfCreature d = new SmurfCreature(new Position(1,1));
		d.changeDirection();
		c.move();
		d.move();
		assertTrue(c.getPosition().getX() == 2 && c.getPosition().getY() == 1 && d.getPosition().getX() == 0 && d.getPosition().getY() == 1);
	}
	
	@Test
	public void testGetId() {
		SmurfCreature c = new SmurfCreature(new Position(1,1));
		assertTrue(c.getId() == 116);
	}
	
	@Test
	public void testGetPosition() {
		SmurfCreature c = new SmurfCreature(new Position(1,1));
		SmurfCreature d = new SmurfCreature(new Position(42,1337));
		assertTrue(c.getPosition().getX() == 1 && c.getPosition().getY() == 1 && d.getPosition().getX() == 42 && d.getPosition().getY() == 1337);
	}
	
	@Test
	public void testChangeDirection() {
		SmurfCreature c = new SmurfCreature(new Position(1,1));
		SmurfCreature d = new SmurfCreature(new Position(1,1));
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_EAST && d.getDirection() == Direction.DIRECTION_WEST);
	}
	
	@Test
	public void testGetDirection() {
		SmurfCreature c = new SmurfCreature(new Position(1,1));
		SmurfCreature d = new SmurfCreature(new Position(1,1));
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_EAST && d.getDirection() == Direction.DIRECTION_WEST);
	}

}
