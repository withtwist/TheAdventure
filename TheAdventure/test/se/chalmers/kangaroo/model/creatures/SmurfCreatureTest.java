package se.chalmers.kangaroo.model.creatures;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.creatures.SmurfCreature;
import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;


public class SmurfCreatureTest {

	
	@Test
	public void testIsKillable() {
		SmurfCreature c = new SmurfCreature(new Position(42,1337));
		assertTrue(!c.isKillable());
	}
	
	@Test
	public void testMove() {
		SmurfCreature s = new SmurfCreature(new Position(10,10));
		SmurfCreature sc = new SmurfCreature(new Position(10,10));
		sc.changeDirection();
		s.move();
		sc.move();
		assertTrue(s.getPosition().getX() == 13 && s.getPosition().getY() == 10 && sc.getPosition().getX() == 7 && sc.getPosition().getY() == 10);
	}
	
	@Test
	public void testGetId() {
		SmurfCreature s = new SmurfCreature(new Position(1,1));
		assertTrue(s.getId() == 116);
	}
	
	@Test
	public void testGetPosition() {
		SmurfCreature s = new SmurfCreature(new Position(1,1));
		SmurfCreature sc = new SmurfCreature(new Position(42,1337));
		assertTrue(s.getPosition().getX() == 1 && s.getPosition().getY() == 1 && sc.getPosition().getX() == 42 && sc.getPosition().getY() == 1337);
	}
	
	@Test
	public void testChangeDirection() {
		SmurfCreature s = new SmurfCreature(new Position(1,1));
		SmurfCreature sc = new SmurfCreature(new Position(1,1));
		sc.changeDirection();
		assertTrue(s.getDirection() == Direction.DIRECTION_EAST && sc.getDirection() == Direction.DIRECTION_WEST);
	}
	
	@Test
	public void testGetDirection() {
		SmurfCreature s = new SmurfCreature(new Position(1,1));
		SmurfCreature sc = new SmurfCreature(new Position(1,1));
		sc.changeDirection();
		assertTrue(s.getDirection() == Direction.DIRECTION_EAST && sc.getDirection() == Direction.DIRECTION_WEST);
	}

}
