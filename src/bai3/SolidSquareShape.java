package bai3;

import java.awt.Graphics2D;
import java.awt.Point;

public class SolidSquareShape extends AbstractDrawnShape {
    public SolidSquareShape(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw(Graphics2D g2d) {
        int side = squareSide();
        g2d.fillRect(left(), top(), side, side);
    }
}
