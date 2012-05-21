package se.chalmers.kangaroo.model.creature;

import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.model.creatures.BlackAndWhiteCreature;
import se.chalmers.kangaroo.model.utils.Position;

public class BlackAndWhiteCreatureTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void polygonTest(){
		BlackAndWhiteCreature bw = new BlackAndWhiteCreature(new Position(3,3));
		bw.getPolygon();
	}

}
