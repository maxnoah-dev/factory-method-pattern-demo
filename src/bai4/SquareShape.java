package bai4;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class SquareShape extends AbstractStyledShape {
    public SquareShape(Point start, Point end, Color color, RenderStyle style) {
        super(start, end, color, style);
    }

    @Override
    protected java.awt.Shape createGeometry() {
        int side = side();
        return new Rectangle2D.Double(left(), top(), side, side);
    }
}
