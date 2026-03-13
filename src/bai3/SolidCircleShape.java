package bai3;

import java.awt.Graphics2D;
import java.awt.Point;

public class SolidCircleShape extends AbstractDrawnShape {
    public SolidCircleShape(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw(Graphics2D g2d) {
        int side = squareSide();
        g2d.fillOval(left(), top(), side, side);
    }
}
