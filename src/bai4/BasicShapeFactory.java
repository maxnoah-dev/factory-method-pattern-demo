package bai4;

import java.awt.Color;
import java.awt.Point;

public class BasicShapeFactory extends ShapeFactory {
    @Override
    public DrawnShape createShape(ShapeKind kind, Point start, Point end, Color color, RenderStyle style) {
        switch (kind) {
            case CIRCLE:
                return new CircleShape(start, end, color, style);
            case SQUARE:
                return new SquareShape(start, end, color, style);
            case RECTANGLE:
                return new RectangleShape(start, end, color, style);
            default:
                throw new IllegalArgumentException("Unsupported shape kind: " + kind);
        }
    }
}
