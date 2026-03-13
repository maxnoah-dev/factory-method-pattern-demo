package bai3;

import java.awt.Point;

public abstract class DrawingShapeFactory {
    public abstract DrawnShape createShape(ShapeKind kind, Point start, Point end);
}
