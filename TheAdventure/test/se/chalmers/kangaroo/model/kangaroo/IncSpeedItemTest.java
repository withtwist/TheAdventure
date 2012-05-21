package se.chalmers.kangaroo.model.kangaroo;

import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.kangaroo.model.utils.Position;

public class IncSpeedItemTest {

	@Test
	public void testOnPickup() {
		IncSpeedItem isi = new IncSpeedItem(35, 2, 2);
		Kangaroo k = new Kangaroo(new Position(2, 2));
		isi.onPickup(k);
		assertTrue(k.getItem() == isi);
	}

}
