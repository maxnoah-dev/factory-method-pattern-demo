package bai3;

import java.awt.Point;

public abstract class AbstractDrawnShape implements DrawnShape {
    protected final Point start;
    protected final Point end;

    protected AbstractDrawnShape(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    protected int left() {
        return Math.min(start.x, end.x);
    }

    protected int top() {
        return Math.min(start.y, end.y);
    }

    protected int width() {
        return Math.abs(end.x - start.x);
    }

    protected int height() {
        return Math.abs(end.y - start.y);
    }

    protected int squareSide() {
        return Math.max(width(), height());
    }
}
