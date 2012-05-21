import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;


public class TileTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsCollidable() {
		Tile notCollidable = new Tile(42, 1, 2);
		Tile collidable = new Tile(1,4,2);
		assertTrue(!notCollidable.isCollidable() && collidable.isCollidable());
	}
	
	@Test
	public void testGetId() {
		Tile hej = new Tile(42,1,1);
		assertTrue(hej.getId()==42);
	}
	
	@Test
	public void testSetId() {
		Tile bla = new Tile(1,1,1);
		bla.setId(42);
		assertTrue(bla.getId() == 42);
	}
	
	@Test
	public void testGetPolygon() {
		Tile hej = new Tile(42,13,37);
		assertTrue(hej.getPolygon() instanceof polygon);
	}
	
	@Test
	public void testChangeId() {
		Tile hej = new Tile(42,13,37);
		hej.changeId(1337);
		assertTrue(hej.getId()==1337);
	}
	
	
	
}
