package bai3;

import java.awt.Point;

public class SolidDrawingShapeFactory extends DrawingShapeFactory {
    @Override
    public DrawnShape createShape(ShapeKind kind, Point start, Point end) {
        switch (kind) {
            case CIRCLE:
                return new SolidCircleShape(start, end);
            case SQUARE:
                return new SolidSquareShape(start, end);
            case RECTANGLE:
                return new SolidRectangleShape(start, end);
            default:
                throw new IllegalArgumentException("Unsupported shape kind: " + kind);
        }
    }
}
