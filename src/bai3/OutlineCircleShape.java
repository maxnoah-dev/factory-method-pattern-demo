package bai3;

import java.awt.Graphics2D;
import java.awt.Point;

public class OutlineCircleShape extends AbstractDrawnShape {
    public OutlineCircleShape(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw(Graphics2D g2d) {
        int side = squareSide();
        g2d.drawOval(left(), top(), side, side);
    }
}
