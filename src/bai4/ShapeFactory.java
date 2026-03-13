package bai4;

import java.awt.Color;
import java.awt.Point;

public abstract class ShapeFactory {
    public abstract DrawnShape createShape(ShapeKind kind, Point start, Point end, Color color, RenderStyle style);
}
