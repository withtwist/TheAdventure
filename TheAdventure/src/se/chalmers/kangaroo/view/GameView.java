package se.chalmers.kangaroo.view;

import javax.swing.ImageIcon;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.model.GameModel;
import se.chalmers.kangaroo.model.Position;

/**
 * 
 * @author alburgh
 * 
 */
public class GameView extends JPanelWithBackground {
	private GameModel gm;

	public GameView(String imagepath, GameModel gm) {
		super(imagepath);
		this.gm = gm;
	}

	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		int drawFrom = getLeftX();
		for (int y = 0; y < gm.getGameMap().getTileHeight(); y++)
			for (int x = drawFrom; x < drawFrom + 32; x++) {
				ImageIcon i = new ImageIcon("../gfx/tiles/tile_"
						+ gm.getGameMap().getTile(x, y).getId() + ".png");
				i.paintIcon(null, g, x * 32, y * 32);

			}
		Position p = gm.getKangaroo().getPosition();
		new ImageIcon("../gfx/kangaroo/kangaroo_58x64_right.png").paintIcon(
				null, g, p.getX(), p.getY());
	}

	private int getLeftX() {
		int kPos = gm.getKangaroo().getPosition().getX() / Constants.TILE_SIZE;
		if (kPos < 32)
			return 0;
		if (gm.getGameMap().getTileWidth() - kPos < 32)
			return gm.getGameMap().getTileWidth() - 32;

		return kPos - 16;
	}
}
