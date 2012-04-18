package se.chalmers.kangaroo.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.DoubleJumpItem;
import se.chalmers.kangaroo.model.Kangaroo;
import se.chalmers.kangaroo.model.Position;

public class DoubleJumpItemTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testOnUse() {
		Kangaroo k = new Kangaroo(new Position(0,0));
		DoubleJumpItem dji = new DoubleJumpItem();
		dji.onUse(k);
		assertTrue(k.doubleJumpEnabled()==true);
	}
	
	@Test
	public void testOnDrop() {
		Kangaroo k = new Kangaroo(new Position(0,0));
		DoubleJumpItem dji = new DoubleJumpItem();
		k.enableDoubleJump();
		dji.onDrop(k);
		assertTrue(k.doubleJumpEnabled()==false);
	}
	
	@Test
	public void testOnPickup() {
		Kangaroo k = new Kangaroo(new Position(0,0));
		DoubleJumpItem dji = new DoubleJumpItem();
		dji.onPickup(k);
		assertTrue(k.getItem().equals(dji));
	}

}
