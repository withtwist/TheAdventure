package se.chalmers.kangaroo.model;

import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.kangaroo.model.kangaroo.ImmortalItem;
import se.chalmers.kangaroo.model.kangaroo.Kangaroo;

public class ImmortalItemTest {

	@Test
	public void test() {
	}
	
	public void testOnUse(Kangaroo k){
		ImmortalItem ii = new ImmortalItem(1, 1, 1);
		k.setImmortal(true);
		ii.onDrop(k);
		assertTrue(k.isImmortal());
	}

}
