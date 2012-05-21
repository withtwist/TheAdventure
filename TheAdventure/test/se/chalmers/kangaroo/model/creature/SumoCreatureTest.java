package se.chalmers.kangaroo.model.creature;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.creatures.SumoCreature;
import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;


public class SumoCreatureTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testIsKillable() {
		SumoCreature c = new SumoCreature(new Position(42,1337));
		assertTrue(!c.isKillable());
	}
	
	@Test
	public void testIsStomping() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		assertTrue(!c.isStomping());
	}
	
	@Test
	public void testIsJumping() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		assertTrue(!c.isJumping());
		
	}

	@Test
	public void testMove() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		c.move();
		assertTrue(c.getPosition().getX() == 1 && c.getPosition().getY() == 1);
	}
	
	@Test
	public void testGetId() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		assertTrue(c.getId() == 115);
	}
	
	@Test
	public void testGetPosition() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		SumoCreature d = new SumoCreature(new Position(42,1337));
		assertTrue(c.getPosition().getX() == 1 && c.getPosition().getY() == 1 && d.getPosition().getX() == 42 && d.getPosition().getY() == 1337);
	}
	
	@Test
	public void testChangeDirection() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		SumoCreature d = new SumoCreature(new Position(1,1));
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_EAST && d.getDirection() == Direction.DIRECTION_WEST);
	}
	
	@Test
	public void testGetDirection() {
		SumoCreature c = new SumoCreature(new Position(1,1));
		SumoCreature d = new SumoCreature(new Position(1,1));
		d.changeDirection();
		assertTrue(c.getDirection() == Direction.DIRECTION_EAST && d.getDirection() == Direction.DIRECTION_WEST);
	}

}
