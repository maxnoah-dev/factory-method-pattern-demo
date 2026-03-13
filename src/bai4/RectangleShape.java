package bai4;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class RectangleShape extends AbstractStyledShape {
    public RectangleShape(Point start, Point end, Color color, RenderStyle style) {
        super(start, end, color, style);
    }

    @Override
    protected java.awt.Shape createGeometry() {
        return new Rectangle2D.Double(left(), top(), width(), height());
    }
}
