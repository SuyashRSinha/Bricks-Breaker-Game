package demogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {

    public int[][] map;
    public int brickWidth;
    public int brickHeight;

    // Constructor
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = 1; // 1 means brick is visible
            }
        }
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    // Set brick to 0 (destroyed) or 1 (visible)
    public void setBrick(int value, int r, int c) {
        map[r][c] = value;
    }

    // Draw the bricks
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    // Draw filled brick
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // Draw brick border
                    g.setColor(Color.black);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }
}
