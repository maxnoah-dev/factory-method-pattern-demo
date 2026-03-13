package bai4;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class SolidStrokeStyle implements StrokeStyle {
    private final float width;

    public SolidStrokeStyle(float width) {
        this.width = width;
    }

    @Override
    public void applyStroke(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(width));
    }
}
