package se.chalmers.kangaroo.test;

import static org.junit.Assert.*;

import java.awt.Polygon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.chalmers.kangaroo.model.*;

public class KangarooTest {
	
	@BeforeClass
	public static void beforeClass(){ //First of all
	System.out.println("Before class");
	}
	
//	@Before
//	public void beforeTestGetItem(){ //Before each method
//	System.out.println("Before testGetItem");
//	}
//	
//	@Test
//	public void testGetItem() {
//		Kangaroo k = new Kangaroo(new Position(2,2));
//		Item dj = new DoubleJumpItem();
//		k.setItem(dj);
//		assertTrue(k.getItem().equals(dj));
//	}
//	
//	@After
//	public void afterTestGetItem(){ //After each method
//	System.out.println("After testGetItem");
//	}
//	
//	@Before
//	public void beforeTestGetPolygon() {
//		System.out.println("before testGetPolygon");
//	}
//	
//	@Test
//	public void testGetPolygon() {
//		Position p = new Position(0, 0);
//		Kangaroo k = new Kangaroo(p);
//		int[] x = {k.getPosition().getX(), k.getPosition().getX() +31, k.getPosition().getX() , k.getPosition().getX()+ 31};
//		int[] y = {k.getPosition().getY(), k.getPosition().getY(), k.getPosition().getY() +63 , k.getPosition().getY() +63};
//		assertTrue();
//		
//	}
//	
//	@After
//	public void afterTestGetPolygon() {
//		System.out.println("After testGetPolygon");
//	}
	
	@Before
	public void beforeTestSetItem() {
		System.out.println("Before testSetItem");
	}
	
	@Test
	public void testSetItem() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		Item dj = new DoubleJumpItem();
		k.setItem(dj);
		assertTrue(k.getItem() == dj);
	}
	
	@After
	public void afterTestSetItem() {
		System.out.println("After testSetItem");
	}
	
	@Before
	public void beforeTestSetRelativePosition() {
		System.out.println("Befote testSetRelativePosition");
	}
	
	@Test
	public void testSetRelativePosition() {
		Position p = new Position(0, 0);
		Kangaroo k = new Kangaroo(p);
		k.setRelativePosition(3, 3);
		Position pt = new Position(3, 3);
		assertTrue(k.getPosition().equals(pt));
		
	}
	
	@After
	public void afterTestSetRelativePosition() {
		System.out.println("After testSetRelativePosition");
	}
	
	@Before
	public void beforeTestSetPosition() {
		System.out.println("Before testSetPosition");
	}
	
	@Test
	public void testSetPosition() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		k.setPosition(new Position(1, 1));
		Position p = new Position(1,1);
		assertTrue(k.getPosition().equals(p));
	}
	
	@After
	public void afterTestSetPosition() {
		System.out.println("After testSetPosition");
	}
	
//	@Before
//	public void beforeTestGetVerticalSpeed() {
//		System.out.println("Before testGetVerticalSpeed");
//	}
//	
//	@Test
//	public void testGetVerticalSpeed() {
//		Kangaroo k = new Kangaroo(new Position(1, 1));
//		k.jump();
//		assertTrue(k.getVerticalSpeed() == 1);
//	}
//	
//	@After
//	public void afterTestGetVerticalSpeed() {
//		System.out.println("After testGetVerticalSpeed");
//	}
	
	@Before
	public void beforeTestEnableDoubleJump() {
		System.out.println("Before testEnableDoubleJump");
	}
	
	@Test
	public void testEnableDoubleJump() {
		Kangaroo k = new Kangaroo(new Position(1, 1));
		k.enableDoubleJump();
		assertTrue(k.isDoubleJumpEnabled() == true);
	}
	
	@After
	public void afterTestEnableDoubleJump() {
		System.out.println("After testEnableDoubleJump");
	}
	
	@Before
	public void beforeTestDisableDoubleJump() {
		System.out.println("Before testDisableDoubleJump");
	}
	
	@Test
	public void testDisableDoubleJump() {
		Kangaroo k = new Kangaroo(new Position(1, 1));
		k.enableDoubleJump();
		k.disableDoubleJump();
		assertTrue(k.isDoubleJumpEnabled() == false);
	}
	
	@After
	public void afterTestDisableDoubleJump() {
		System.out.println("After testDisableDoublejump");
	}
	
	@Before
	public void beforeTestJump() {
		System.out.println("Before testJump");
	}
	
	@Test
	public void testJump() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		k.jump();
		assertTrue(k.getVerticalSpeed() > 0);
	}
	
	@After
	public void afterTestJump() {
		System.out.println("Arfter testJump");
	}
	
//	@Before
//	public void beforeTestMove() {
//		System.out.println("Before testMove");
//	}
//	
//	@Test
//	public void testMove() {
//		Kangaroo k = new Kangaroo (new Position(2, 2));
//		k.setDirection(Direction.DIRECTION_EAST);
//		k.move();
//		final boolean dirEast = (k.getPosition().getY() == 3);
//		k.setDirection(Direction.DIRECTION_WEST);
//		k.move();
//		final boolean dirWest = (k.getPosition().getY() == 2);
//		k.jump();
//		k.move();
//		assertTrue(dirEast && dirWest && k.getPosition().getX() == 2);
//	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
}
