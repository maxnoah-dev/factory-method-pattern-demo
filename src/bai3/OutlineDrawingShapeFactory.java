package bai3;

import java.awt.Point;

public class OutlineDrawingShapeFactory extends DrawingShapeFactory {
    @Override
    public DrawnShape createShape(ShapeKind kind, Point start, Point end) {
        switch (kind) {
            case CIRCLE:
                return new OutlineCircleShape(start, end);
            case SQUARE:
                return new OutlineSquareShape(start, end);
            case RECTANGLE:
                return new OutlineRectangleShape(start, end);
            default:
                throw new IllegalArgumentException("Unsupported shape kind: " + kind);
        }
    }
}
