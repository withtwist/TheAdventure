import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.InteractiveTile;


public class InteractiveTileTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testOnTrigger() {
		InteractiveTile hej = new InteractiveTile(42, 1, 1);
		hej.onTrigger();
		assertTrue((hej.getId()== 41) && hej.isCollidable());
	}
	
	@Test
	public void testIsCollidable() {
		InteractiveTile bla = new InteractiveTile(1337, 4, 2);
		assertTrue(bla.isCollidable());
	}
	

}
