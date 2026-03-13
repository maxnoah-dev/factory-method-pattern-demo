package bai3;

import java.awt.Graphics2D;
import java.awt.Point;

public class SolidRectangleShape extends AbstractDrawnShape {
    public SolidRectangleShape(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillRect(left(), top(), width(), height());
    }
}
