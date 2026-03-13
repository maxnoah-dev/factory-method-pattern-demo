package bai4;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class CircleShape extends AbstractStyledShape {
    public CircleShape(Point start, Point end, Color color, RenderStyle style) {
        super(start, end, color, style);
    }

    @Override
    protected java.awt.Shape createGeometry() {
        int side = side();
        return new Ellipse2D.Double(left(), top(), side, side);
    }
}
