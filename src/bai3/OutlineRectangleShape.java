package bai3;

import java.awt.Graphics2D;
import java.awt.Point;

public class OutlineRectangleShape extends AbstractDrawnShape {
    public OutlineRectangleShape(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.drawRect(left(), top(), width(), height());
    }
}
