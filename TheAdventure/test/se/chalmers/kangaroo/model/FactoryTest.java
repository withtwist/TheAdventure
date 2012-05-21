package se.chalmers.kangaroo.model;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.model.utils.Position;

public class FactoryTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void itemsTest(){
		TileFactory f = new TileFactory();
		for(int i = 0; i < 200; i++)
			if( Constants.ITEM_IDS.contains(" "+i+" ") ){
				assertTrue(f.createItem(i, 10, 10) != null);
			}else{
				assertTrue(f.createItem(i, 10, 10) == null);
			}
	}
	
	@Test
	public void interactiveTileTest(){
		TileFactory f = new TileFactory();
		for(int i = 0; i < 200; i++)
			if( Constants.INTERACTIVE_TILES.contains(" "+i+" ") ){
				assertTrue(f.createTile(i, 10, 10) instanceof InteractiveTile);
			}else{
				assertTrue(!(f.createTile(i, 10, 10) instanceof InteractiveTile));
			}
	}
	
	@Test
	public void creatureTest(){
		TileFactory f = new TileFactory();
		for(int i = 0; i < 200; i++){
			if( Constants.CREATURE_IDS.contains(" "+i+" ")){
				assertTrue(f.createCreature(i, new Position(10,10)) != null);
			}else{
				assertTrue(f.createCreature(i, new Position(10,10)) == null);
			}
		}
	}
	
	@Test
	public void iObjectTest(){
		TileFactory f = new TileFactory();
		for(int i = 0; i < 200; i++){
			if( Constants.IOBJECTS_IDS_REDBLUE.contains(" "+i+" ")){
				assertTrue(f.createIObjects(i, 10, 10, null) != null);
			}else{
				assertTrue(f.createIObjects(i, 10, 10, null) == null);
			}
		}
	}

}
