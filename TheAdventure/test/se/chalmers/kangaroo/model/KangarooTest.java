package se.chalmers.kangaroo.model;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.kangaroo.model.Kangaroo;
import se.chalmers.kangaroo.model.item.DoubleJumpItem;
import se.chalmers.kangaroo.model.item.Item;
import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;
import se.chalmers.kangaroo.model.kangaroo.Kangaroo;

public class KangarooTest {

	@BeforeClass
	public static void beforeClass() { // First of all
		System.out.println("Before class");
	}

	@Before
	public void beforeTestGetItem() { // Before each method
		System.out.println("Before testGetItem");
	}

	@Test
	public void testGetItem() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		Item dj = new DoubleJumpItem();
		k.setItem(dj);
		assertTrue(k.getItem().equals(dj));
	}

	@After
	public void afterTestGetItem() { // After each method
		System.out.println("After testGetItem");
	}

	@Before
	public void beforeTestGetPolygon() {
		System.out.println("before testGetPolygon");
	}

	@Test
	public void testGetPolygon() {
		Position p = new Position(0, 0);
		Kangaroo k = new Kangaroo(p);
		int[] x = { k.getPosition().getX(), k.getPosition().getX() + 31,
				k.getPosition().getX(), k.getPosition().getX() + 31 };
		int[] y = { k.getPosition().getY(), k.getPosition().getY(),
				k.getPosition().getY() + 63, k.getPosition().getY() + 63 };
		assertTrue();

	}

	@After
	public void afterTestGetPolygon() {
		System.out.println("After testGetPolygon");
	}

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
		Position p = new Position(1, 1);
		assertTrue(k.getPosition().equals(p));
	}

	@After
	public void afterTestSetPosition() {
		System.out.println("After testSetPosition");
	}

	@Before
	public void beforeTestGetVerticalSpeed() {
		System.out.println("Before testGetVerticalSpeed");
	}

	@Test
	public void testGetVerticalSpeed() {
		Kangaroo k = new Kangaroo(new Position(1, 1));
		k.jump();
		assertTrue(k.getVerticalSpeed() == 1);
	}

	@After
	public void afterTestGetVerticalSpeed() {
		System.out.println("After testGetVerticalSpeed");
	}

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

	@Before
	public void beforeTestMove() {
		System.out.println("Before testMove");
	}

	@Test
	public void testMove() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		k.setDirection(Direction.DIRECTION_EAST);
		k.move();
		final boolean dirEast = (k.getPosition().getY() == 3);
		k.setDirection(Direction.DIRECTION_WEST);
		k.move();
		final boolean dirWest = (k.getPosition().getY() == 2);
		k.jump();
		k.move();
		assertTrue(dirEast && dirWest && k.getPosition().getX() == 2);
	}

	@After
	public void afterTestMove() {
		System.out.println("After testMove");
	}

	@Before
	public void beforeTestEquals() {
		System.out.println("Before testEquals");
	}

	@Test
	public void testEquals() {
		Kangaroo k1 = new Kangaroo(new Position(2, 2));
		Kangaroo k2 = new Kangaroo(new Position(2, 2));
		assertTrue(k1.equals(k2));
	}

	@After
	public void afterTestEquals() {
		System.out.println("After testEquals");
	}

	@Before
	public void beforeTestGetDirection() {
		System.out.println("Before testGetDirection");
	}

	@Test
	public void testGetDirection() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		k.setDirection(Direction.DIRECTION_WEST);
		assertTrue(k.getDirection() == Direction.DIRECTION_WEST);
	}

	@After
	public void afterTestGetDirection() {
		System.out.println("After testGetDirection");
	}

	@Before
	public void beforeTestGetPosition() {
		System.out.println("Before testGetBosition");
	}

	@Test
	public void testGetPosition() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		assertTrue(k.getPosition() == new Position(2, 2));
	}

	@After
	public void afterTestGetPosition() {
		System.out.println("After testGetPosition");
	}

	@Before
	public void beforeTestGetPosition() {
		System.out.println("Before testGetSpawnPosition");
	}

	@Test
	public void testGetSpawnPosition() {
		Kangaroo k = new Kangaroo(new Position(2, 2));
		assertTrue(k.getSpawnPosition());
	}

	@After
	public void afterTestGetSpawnPosition() {
		System.out.println("After testGetSpawnPosition");
	}

	@Before
	public void beforeTestGetStillJumping() {
		System.out.println("Before testGetStillJumping");
	}

	@Test
	public void testGetStillJumping() {
		Kangaroo k = new Kangaroo(2, 2);
		k.jump();
		assertTrue(k.getStillJumping());
	}

	@After
	public void afterTestGetStillJumping() {
		System.out.println("After testGetStillJumping");
	}

	@Before
	public void beforeTestIstDoubleJumpEnabled() {
		System.out.println("Before testIsDoubleJumpEnabled");
	}

	@Test
	public void testIsDoubleJumpEnabled() {
		Kangaroo k = new Kangaroo(2, 2);
		k.enableDoubleJump();
		assertTrue(k.isDoubleJumpEnabled());
	}

	@After
	public void afterTestIsDoubleJumpEnabled() {
		System.out.println("After isDoubleJumpEnabled");
	}
	
	@Before
	public void beforeIsImmortal(){
		System.out.println("Before isImmortal");
	}
	
	@Test
	public void isImmortal() {
		Kangaroo k = new Kangaroo(2, 2);
		k.setImmortal(true);
		assertTrue(k.isImmortal());
	}
	
	@After
	public void afterIsImmortal(){
		System.out.println("After isImmortal");
	}
	
	@Before
	public void beforeTestReset() {
		System.out.println("Before testReset");
	}
	
	@Test
	public void testReset() {
		Kangaroo k = new Kangaroo(2, 2);
		k.setDirection(Direction.DIRECTION_EAST);
		k.move();
		k.reset();
		assertTrue(k.getPosition() == new Position(2, 2)
				|| k.getVerticalSpeed() == 0);
	}
	
	@After
	public void afterTestReset(){
		System.out.println("After testReset");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
}
