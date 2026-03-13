package bai4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class AbstractStyledShape implements DrawnShape {
    protected final Point start;
    protected final Point end;
    protected final Color color;
    protected final RenderStyle style;

    protected AbstractStyledShape(Point start, Point end, Color color, RenderStyle style) {
        this.start = start;
        this.end = end;
        this.color = color;
        this.style = style;
    }

    @Override
    public void draw(Graphics2D g2d) {
        java.awt.Shape geometry = createGeometry();
        style.getFillStyle().fill(g2d, geometry, color);

        style.getStrokeStyle().applyStroke(g2d);
        Color old = g2d.getColor();
        g2d.setColor(color);
        g2d.draw(geometry);
        g2d.setColor(old);
    }

    protected abstract java.awt.Shape createGeometry();

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

    protected int side() {
        return Math.max(width(), height());
    }
}
