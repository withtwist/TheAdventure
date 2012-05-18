import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.creatures.CrabCreature;
import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;


public class CrabCreatureTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsKillable() {
		CrabCreature c = new CrabCreature(new Position(42,1337));
		assertTrue(c.isKillable());
	}
	
	@Test
	public void testMove() {
		CrabCreature c = new CrabCreature(new Position(1,1));
		c.move();
		assertTrue(c.getPosition().getX()==0 && c.getPosition().getY() ==1);
	}
	
	@Test
	public void testGetId() {
		CrabCreature c = new CrabCreature(new Position(42,1337));
		assertTrue(c.getId() == 111);
	}
	
	@Test
	public void testGetPos() {
		CrabCreature c = new CrabCreature(new Position(42,1337));
		assertTrue(c.getPosition().getX() == 42 && c.getPosition().getY() == 1337);
	}
	
	@Test
	public void testChangeDirection() {
		CrabCreature c = new CrabCreature(new Position(42,1337));
		CrabCreature d = new CrabCreature(new Position(1,1));
		c.changeDirection();
		c.changeDirection();
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_WEST && d.getDirection() == Direction.DIRECTION_EAST);
	}
	
	@Test
	public void testGetDirection() {
		CrabCreature c = new CrabCreature(new Position(42,1337));
		CrabCreature d = new CrabCreature(new Position(1,1));
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_WEST && d.getDirection() == Direction.DIRECTION_EAST);
	}

}
